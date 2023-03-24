package u1.w2.d3.Esercizio1;

public class MainSimboloR {

	public static void main(String[] args) {
		
		//2 Sequenze (runnable)
		RunnableEs1 sequenza1 = new RunnableEs1("!");
		RunnableEs1 sequenza2 = new RunnableEs1("?");
		// 2 thread 
		Thread t1 = new Thread(sequenza1);
		Thread t2 = new Thread(sequenza2);
		
		//esercuzione del run dei due thread
		
		
		try {
		t1.start();
		t2.start();
		
	}

}
