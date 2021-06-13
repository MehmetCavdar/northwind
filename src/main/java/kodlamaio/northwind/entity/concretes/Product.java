package kodlamaio.northwind.entity.concretes;

import java.util.List;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity  					// Anotasyon yöntemiyle Entity oldugunu tanitma (veri tabani nesnesi)
@Table (name="products")	// class'i veri tabaniyla eslestirme
@Data 			            // Lombok Getter-Setter-Base Consructor Kurulumu icin
@AllArgsConstructor        // tüm degiskenli constructor
@NoArgsConstructor         // degiskensiz constructor
public class Product  {
	
	@Id   						// ID alanini tanitmaliyiz. PK(Primariy Key)
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //  ID üretim yöntemi belirtilmeli
	@Column	(name="product_id")	// Field'leri veri tabani ilgili dosya sütün ile eslestirme
	private int id;
	
	///@Column(name="category_id")	  //asagida Category tablo ile iliskii olarak tanimladik
	////private int categoryId; 
	
	@Column	(name="product_name")	
	private String name;
	
	@Column	(name="unit_price")	
	private double unitPrice;
	
	@Column	(name="units_in_stock")	
	private int unitsInStock;
	
	@Column	(name="quantity_per_unit")	
	private String quantityPerUnit;
	
	@ManyToOne ()
	@JoinColumn (name="category_id")
	private Category category ;  // Category tablosuyla iliski kuruyoruz a
	                    // Ancak her ürünün bir category numarasi oldugu iin liste degildir
	
}
