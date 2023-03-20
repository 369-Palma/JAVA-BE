package u1.w2.d1.Esercizio3;

public class BancaException extends Exception {
private String message;
	
public BancaException(String msg) {
super("Valore errato! " + msg);
message = msg;
	toString();
}
public String toString(String msg) {
	return message;
}

}
