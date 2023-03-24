package u1.w2.d3.Esercizio1;

public class RunnableEs1 implements Runnable{

	//parametri
	
	private String simbolo;
	private int num;
	
	//contructor
	
	public RunnableEs1(String s) {
		this.simbolo = s;
	}
	

	@Override
	public void run() {
		for(int i= 0; i<10; i++) {
			System.out.println(this.simbolo);
		}
		
		try {
			Thread.sleep(1000);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
