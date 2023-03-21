package u1.w2.d2;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class Esercizio2 {

static List <Integer> listaOrdinata = new ArrayList <Integer> ();	
static List <Integer> newLista= new ArrayList <Integer> ();
public static void main(String[] args) {
		getListaOrdinata(5);
		getNuovaLista(listaOrdinata);
	}

	//funzioni
	
	public static List<Integer> getListaOrdinata(int N) {
		
	
		for(int i = 0; i<N; i++) {
		int num = (int)(Math.random()*100);
		
		listaOrdinata.add(num);		
		
	}
		System.out.println("arra con list: " + listaOrdinata);
		listaOrdinata.sort(null);
        System.out.println("Lista ordinata: " + listaOrdinata);
	return listaOrdinata;
	}
	
	//lista con elementi nell'ordine inverso
	public static void getListaInversa(List<Integer> lista){
		
		List<Integer> listaIniziale = lista;
		System.out.println(listaIniziale);
		Collections.sort(lista, Collections.reverseOrder());	
		System.out.println(lista);
		//ArrayList.addAll(Collections.listaIniziale(null),Collections.list(null));
		
		System.out.println(listaIniziale.addAll(lista));
		
		
}
	
	public static List<Integer> getNuovaLista (List<Integer> lista){
		List <Integer> l = lista;
		for(int i =lista.size(); i>0; i--) {
			l.add(lista.get(i-1));
		}
		
		System.out.println(l);
		return l;
		
	}
	

	
	
}
