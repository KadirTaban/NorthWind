package ko.northwind.business.abstracts;

import ko.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
