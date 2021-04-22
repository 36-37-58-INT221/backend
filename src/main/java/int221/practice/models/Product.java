package int221.practice.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "brandfk", referencedColumnName = "brandId")
	@JoinColumn(name = "haveId", referencedColumnName = "haveId")

	private String productId;
	private String name;
	private int price;
	private String description;
	private Date productDate;
	private String brandfk;
	private String haveId;

	public Product() {
	};

	public Product(String productId, String name, int price, String description, Date productDate, String brandfk,
			String haveId) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.description = description;
		this.productDate = productDate;
		this.brandfk = brandfk;
		this.haveId = haveId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getProductDate() {
		return productDate;
	}

	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

	public String getBrandfk() {
		return brandfk;
	}

	public void setBrandfk(String brandfk) {
		this.brandfk = brandfk;
	}

	public String getHaveId() {
		return haveId;
	}

	public void setHaveId(String haveId) {
		this.haveId = haveId;
	}

}