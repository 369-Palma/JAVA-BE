package u1.w2.d4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mainprodotti {

	public static void main(String[] args) {
		//prodotti
		Product p1 = new Product(24253462456l,"Il generale Badoglio", "Books", 102.3);
		Product p2 = new Product(24232462456l,"bambola gonfiabile", "Boy",25.9);
		Product p3 = new Product(24253462856l,"bieron","Baby", 7.80);
		Product p4 = new Product(24232462456l,"la bella e la bestia", "Books", 100);
		Product p5 = new Product (4923429345l, "passeggino", "Baby", 127.32);
		
		List <Product> p = new ArrayList <Product>();
	 
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		
		//clienti
		
		Customer c1 = new Customer(231332342l,"Pippo", 3);
		Customer c2 = new Customer(231222142l,"Pluto", 3);		
		Customer c3 = new Customer(2313344232l,"Paperino", 3);
		
		List <Customer> c = new ArrayList<Customer>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
			
		//lista prodotti
		
		List<Product> pOrd1 = new ArrayList<Product>();
		pOrd1.add(p1);
		pOrd1.add(p3);
		pOrd1.add(p1);
		pOrd1.add(p4);
		Order Ord1 = new Order(492364198, "consegnato", LocalDate.of(2023,03, 21), LocalDate.of(2023,03, 23), pOrd1, c2);
		
		
		List<Product> pOrd2 = new ArrayList<Product>();
		pOrd2.add(p1);
		pOrd2.add(p3);
		pOrd2.add(p1);
		pOrd2.add(p4);
		Order Ord2 = new Order(494353568, "in elaborazione", LocalDate.of(2023,03, 21), LocalDate.of(2023,03, 23), pOrd1, c3);
		
		
		List<Product> pOrd3 = new ArrayList<Product>();
		pOrd3.add(p1);
		pOrd3.add(p3);
		pOrd3.add(p1);
		pOrd3.add(p4);
		Order Ord3 = new Order(494353568, "consegnato", LocalDate.of(2022,01, 21), LocalDate.of(2022,02, 01), pOrd1, c3);

		//lista ordini
		
		List <Order> ordini = new ArrayList <Order>(); 
		ordini.add(Ord1);
		ordini.add(Ord2);
		ordini.add(Ord3);
		
		//ESERCIZIO 1 PRODOTTI


	//ESERCIZIO 2 ORDINI
	

	Stream <Order> sO = ordini.stream();
	sO.map(o -> {return o.getProducts();})
	.flatMap(o->o.stream())
	.filter(pr -> pr.getCategory().equals("Baby"));
	List <Order> orderBaby = sO.collect(Collectors.toList());
	
	System.out.print(orderBaby.toString());
	

}
	
	
	
	
	
}
