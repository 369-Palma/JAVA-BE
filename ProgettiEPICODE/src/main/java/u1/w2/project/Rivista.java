package u1.w2.project;

//import lombok.Getter;
//import lombok.ToString;
//import lombok.AllArgsConstructor;

//@AllArgsConstructor @ToString @Getter 
public class Rivista extends ArticoloBiblioteca {
	
	public Periodicita periodicita;
	
	//costruttore 
	public Rivista (String isbn, String titolo, int anno, int pages, Periodicita periodicita) {
		super(isbn,titolo,anno,pages);
		this.periodicita = periodicita;
	}

}
