package u1.w2.project;

//import lombok.Getter;
//import lombok.ToString;
//import lombok.AllArgsConstructor;

// @AllArgsConstructor @ToString @Getter 
public class Libro extends ArticoloBiblioteca {

	private String autore;
	private String genere;
	
			//costruttore
	
	public Libro(String isbn, String titolo, int anno, int pages, String autore, String genere) {
		super(isbn,titolo,anno,pages);
		this.autore = autore;
		this.genere = genere;
	}

	
	
}
