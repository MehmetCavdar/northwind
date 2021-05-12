package kodlamaio.northwind.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entity.concretes.Product;


@Service   // Adim 9: Business görevini görecek kismi oldugunu belirten koddur
public class ProductManager implements ProductService {
	
	private ProductDao productDao;  // injektion yapilmis oldu
	
	@Autowired   // Adim 9: ProductDAo icin otomatik instance üretmek icin gereken kod
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	

	@Override
	public List<Product> getAll() {
		return this.productDao.findAll();
	}



}
