package ko.northwind.business.abstracts;

import ko.northwind.core.utilities.results.DataResult;
import ko.northwind.core.utilities.results.Result;
import ko.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();

    Result add(Product product);

    DataResult<Product> getByProductName(String productName);



    DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);

    DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);

    DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

    DataResult<List<Product>> getByProductNameContains(String productName);

    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> GetByNameAndCategory(String productName, int categoryId);

}
