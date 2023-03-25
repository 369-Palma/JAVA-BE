package u1.w2.project;

//import lombok.Getter;
//import lombok.ToString;
//import lombok.AllArgsConstructor;

// @AllArgsConstructor @ToString @Getter 
public class Libro extends ArticoloBiblioteca {

	public String autore;
	private String genere;
	
			//costruttore
	
	public Libro(long isbn, String titolo, int anno, int pages, String autore, String genere) {
		super(isbn,titolo,anno,pages);
		this.autore = autore;
		this.genere = genere;
	}

	//Getters - non funziona l'installazione di lombok quindi li devo scrivere io (meglio, così mi esercito)
	
	public String getAutore() {
	return autore;
	}
	
}
