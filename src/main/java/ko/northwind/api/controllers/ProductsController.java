package ko.northwind.api.controllers;

import ko.northwind.business.abstracts.ProductService;
import ko.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    private ProductService productService;
    @GetMapping("/getall")

    public List<Product> getAll(){
        return this.productService.getAll();
    }
}
