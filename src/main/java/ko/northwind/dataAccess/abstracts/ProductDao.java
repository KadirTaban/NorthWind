package ko.northwind.dataAccess.abstracts;

import ko.northwind.entities.concretes.Product;

import org.springframework.data.jpa.repository.JpaRepository;
//dao = repository
public interface ProductDao extends JpaRepository<Product,Integer> {
}
