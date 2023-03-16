package u1.w1.d2.Es3;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Runnable {

	public static void main(String[] args) {
		//creo varabili con dati cliente presi dall'input 
		Scanner scanner = new Scanner(System.in);
		System.out.println("**********        Cliente                         **********");
		System.out.println("*                                                                  *");
		System.out.println("*  Inserire il suo nome seguito dal tasto Invio  *");
		System.out.println("*                                                                  *");
		String nomeCliente = scanner.next();
		System.out.println("*                                                                  *");
		System.out.println("*  Inserire il suo cognome seguito dal tasto Invio  *");
		System.out.println("*                                                                  *");
		String cognomeCliente = scanner.next();
		System.out.println("*                                                                  *");
		System.out.println("*  Inserire la sua email seguita dal tasto Invio  *");
		System.out.println("*                                                                  *");
		String email = scanner.next();
		System.out.println("*                                                                  *");
		System.out.println("*  Inserire la data seguita dal tasto Invio  *");
		System.out.println("*                                                                  *");
		String dataRegistrazione = scanner.next();
		long codiceCliente = new Random().nextLong();
		Cliente.StampaDatiCliente(codiceCliente, nomeCliente,cognomeCliente,email, dataRegistrazione);
		
		
		
	}
	
	

}
