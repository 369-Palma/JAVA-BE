package u1.w2.d1.Esercizio3;

public class BancaException extends Exception {
private String message;
	
public BancaException(String msg) {
super();
message = msg;
	
}
public String toString() {
	return message;
}

}
