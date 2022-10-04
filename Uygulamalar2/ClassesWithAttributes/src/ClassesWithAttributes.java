public class ClassesWithAttributes {

	public static void main(String[] args) {

		Product product = new Product();
//			(5,"laptop","asus laptop",15568,3);
		product.setName("laptop");
		product.setId(5);
		product.setDescription("asus laptop");
		product.setPrice(15568);
		product.setStock(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		// System.out.println(product.name);

		System.out.println(product.getDescription());

	}

}
