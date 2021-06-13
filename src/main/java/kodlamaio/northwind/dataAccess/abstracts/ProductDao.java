package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entity.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {

	Product getByProductName (String ProductName);
	
	Product getByProductNameAndCategoryId (String ProductName, int categoryId);
	
	List<Product> getByProductNameOrCategoryId (String ProductName, int categoryId);

	List<Product> getByCategoryIdIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	@Query ("")
	List<Product>GetByNameAndCategory(String ProductName, int categoryId);
	
}
