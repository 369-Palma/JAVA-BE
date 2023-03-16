package u1.w1.d2.Es2;

public class Runnable {

	public static void main(String[] args) {	
		SIM mySim = new SIM("3712293729");		
	
	mySim.setCreditoDisponibile(15);
	
	Chiamata chiamata = new Chiamata("3742836396", 10);
	mySim.getListaChiamate()[0] = chiamata;
	
	chiamata = new Chiamata("3326548321",4);
	mySim.getListaChiamate()[1] = chiamata;
	
	chiamata = new Chiamata("3742215396", 7);
	mySim.getListaChiamate()[2] = chiamata;
	
	chiamata = new Chiamata("3519438321",2);
	mySim.getListaChiamate()[3] = chiamata;
	
	chiamata = new Chiamata("3519438321",1);
	mySim.getListaChiamate()[4] = chiamata;


	mySim.stampaInfo();
}	
	
}