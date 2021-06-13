package kodlamaio.northwind.entity.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  					// Anotasyon yöntemiyle Entity oldugunu tanitma (veri tabani nesnesi)
@Table (name="categories")	// class'i veri tabaniyla eslestirme
@Data 			// Lombok Getter-Setter-Base Consructor Kurulumu icin
@AllArgsConstructor
@NoArgsConstructor
public class Category {	
	@Id
	@Column	(name="category_id")	// Field'leri veri tabani ilgili dosya sütün ile eslestirme
	private int categoryId;
	
	@Column	(name="category_name")
	private String categoryName;
	
	
	@OneToMany (mappedBy = "categories")  // Product tablosu ile iliskj türü
	private List<Product> products;  // Ürün tablosuyla iliski kuruyoruz
	
}
