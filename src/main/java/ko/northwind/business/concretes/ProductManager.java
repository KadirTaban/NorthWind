package ko.northwind.business.concretes;

import ko.northwind.business.abstracts.ProductService;
import ko.northwind.core.utilities.results.DataResult;
import ko.northwind.core.utilities.results.Result;
import ko.northwind.core.utilities.results.SuccessDataResult;
import ko.northwind.core.utilities.results.SuccessResult;
import ko.northwind.dataAccess.abstracts.ProductDao;
import ko.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired

    public ProductManager(ProductDao productDao){
        super();
        this.productDao=productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {

        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");

    }



    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }
}
