package u1.w2.d3.Esercizio3;

import java.util.ArrayList;
import java.util.List;

public class Presenze {
	private String nome;
	private int presenzaGiorni;
	
	//contructor
	public Presenze(String n, int gg) {
		this.nome = n;
		this.presenzaGiorni = gg;
	}
	
	public void getDipendentePresenza() {
		String dipendente = this.nome + this.presenzaGiorni;
		System.out.println(dipendente);
	}
	
	
	List <Integer> presenze = new ArrayList <Integer>();
	
	
	
	
}
