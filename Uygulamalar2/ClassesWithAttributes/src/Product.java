public class Product {

//	 public Product(int id,String name, String description,double price,int stock) {
//	        System.out.println("Yapıcı blok çalıştı.");
//	        this.id=id;
//	        this.name=name;
//	        this.description=description;
//	        this.price=price;
//	        this.stock=stock;
//	 }
	public Product() {

	}

	// field && attribute
	int id;
	String name;
	String description;
	double price;
	int stock;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.name.substring(0, 3);
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
