package kodlamaio.northwind.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Entity  					// Anotasyon yöntemiyle Entity oldugunu tanitma (veri tabani nesnesi)
@Table (name="products")	// class'i veri tabaniyla eslestirme

@Data 			// Lombok Getter-Setter-Base Consructor Kurulumu icin
public class Product  {
	
	@Id   						// ID alanini tanitmaliyiz. PK(Primariy Key)
	@GeneratedValue  	  		 //  ID üretim yöntemi belirtilmeli
	@Column	(name="product_id")	// Field'leri veri tabani ilgili dosya sütün ile eslestirme
	private int id;
	
	@Column	(name="category_id")	
	private int categoryId; 
	
	@Column	(name="product_name")	
	private String name;
	
	@Column	(name="unit_price")	
	private double unitPrice;
	
	@Column	(name="units_in_stock")	
	private int unitsInStock;
	
	@Column	(name="quantity_per_unit")	
	private String quantityPerUnit;
	
}
