package u1.w2.d4;

public class Product {
private long id;
private String name;
private String category;
private double price;

//costruttore

public Product(long id, String n, String c, double p) {
	this.id = id;
	this.name = n;
	this.setCategory(c);
	this.price = p;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}


}




