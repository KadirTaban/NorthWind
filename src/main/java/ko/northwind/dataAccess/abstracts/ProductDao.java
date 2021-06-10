package ko.northwind.dataAccess.abstracts;

import ko.northwind.entities.concretes.Product;

import ko.northwind.entities.dtos.ProductWithCategoryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//dao = repository
public interface ProductDao extends JpaRepository<Product,Integer> {
    Product getByProductName(String productName);

    Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);

    List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

    List<Product> getByCategoryIn(List<Integer> categories);

    List<Product> getByProductNameContains(String productName);

    List<Product> getByProductNameStartsWith(String productName);

    @Query("from Product where productName=:productName and category.categoryId=:categoryId")

    List<Product> GetByNameAndCategory(String productName, int categoryId);

    @Query("select new ko.northwind.entities.dtos.ProductWithCategoryDto(p.id,p.productName,c.categoryName) From Category c Inner join c.products p")
    List<ProductWithCategoryDto> getProductWithCategoryDetails();

    //select p.productId,p.productName,c.categoryName from Category c inner join Product p
    //select * from products where product_name=birsey and categoryId=birsey
    //on c.categoryId = p.categoryId



}
