package ko.northwind.business.abstracts;

import ko.northwind.core.utilities.results.DataResult;
import ko.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
}
