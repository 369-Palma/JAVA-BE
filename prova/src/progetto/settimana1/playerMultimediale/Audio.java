package progetto.settimana1.playerMultimediale;

public class Audio {

	private String titolo;
	private int durata = 1;
	private int volume;


	//constructor
	public Audio(String titolo, int durata, int vol) {
		this.titolo = titolo;
		this.durata = durata;
		this.volume = vol;
	}

	//metodi
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String title) {
		this.titolo = title;
	}

	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int l) {
		volume = l;
	}

	//funzionalità

	// metodo per regolare il volume
	public void aumentaVolume() {
		this.volume++;
	}

	public void riduciVolume() {
		this.volume--;
	}


	public void play() {
		
		 String volumeStringa= this.titolo;
		 
		 for(int j = 0; j <= this.durata; j++) { 
		 
			for (int i=1; i <= this.volume; i++) {
				volumeStringa = volumeStringa + " " + "!" + "/n/n";
				System.out.println(volumeStringa);
			}
		 }
		
		}
	
}
	


