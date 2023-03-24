package u1.w2.d4;

import java.time.LocalDate;
import java.util.List;

public class Order {
private long id;
private String status;
private LocalDate orderDate;
private LocalDate deliveryDate;
List<Product> products;
Customer customer;

//constructor

public Order(long id, String s, LocalDate ord, LocalDate d, List<Product> p, Customer c) {
	this.id= id;
	this.status = s;
	this.deliveryDate = ord;
	this.deliveryDate = d;
	this.products = p;
	this.customer= c;
}

public List<Product> getProducts() {
	return products;
}










}
