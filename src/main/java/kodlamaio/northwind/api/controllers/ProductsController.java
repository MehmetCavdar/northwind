package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entity.concretes.Product;

@RestController
@RequestMapping ("/api/products")   // Arayüzdeki istege göre ilgili Controlleri cagirmak üzere eslestirme
public class ProductsController {

	
	private ProductService productService; 
	
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}



	@GetMapping ("/getall")
	public List<Product> getAll(){
		
			return this.productService.getAll();
		
	}
	
	
}
