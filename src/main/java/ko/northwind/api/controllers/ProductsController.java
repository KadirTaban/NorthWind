package ko.northwind.api.controllers;

import ko.northwind.business.abstracts.ProductService;
import ko.northwind.core.utilities.results.DataResult;
import ko.northwind.core.utilities.results.Result;
import ko.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {

    @Autowired
    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }

    private ProductService productService;


    @GetMapping("/getall")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);

    }
    @GetMapping("getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName){
        return this.productService.getByProductName(productName);
    }
}
