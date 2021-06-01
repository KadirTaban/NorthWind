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

    @Override
    public DataResult<Product> getByProductName(String productName) {
        return new SuccessDataResult<Product>(this.productDao.getByProductName(productName),"Data listelendi");
    }

    @Override
    public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {

        //business codes
        return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory(productName, categoryId),"Data listelendi");

    }

    @Override
    public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategory(productName, categoryId),"Data listelendi");
    }

    @Override
    public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByCategoryIn(categories),"Data listelendi.");
    }

    @Override
    public DataResult<List<Product>> getByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName),"Data listelendi.");

    }

    @Override
    public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
        return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName),"Data listelendi.");

    }

    @Override
    public DataResult<List<Product>> GetByNameAndCategory(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(this.productDao.GetByNameAndCategory(productName,categoryId),"Data listelendi.");
    }
}
