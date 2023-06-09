package progetto.settimana1.playerMultimediale;

public class Video {
	private String titolo;
	private int durata = 1;
	private int luminosita;
	private int volume;
	
//constructor
	public Video(String titolo, int durata, int l,int vol) {
		this.titolo = titolo;
		this.durata = durata;
		this.luminosita = l;
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

	public int getLuminosita() {
		return luminosita;
	}
	public void setLuminosita(int l) {
		luminosita = l;
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
			
			 String title= this.titolo;
			 String vol="";
			 String lum = "";
			 
			 	for (int i=1; i <= this.volume; i++) {
						vol = vol + " " + "!" ;
				}
			 	
			 	for (int j=1; j <=this.luminosita; j++) {
			 		lum = lum + "" + "*";
			 	}
					
			 for(int j = 1; j <= this.durata; j++) { 
			 System.out.println(title + "" + vol);			 
				}
			 
			 System.out.println(lum);			
			 }
		
		
		// metodo per luminosità
		public void aumentaLuminosita() {
			this.luminosita++;
		}

		public void riduciLuminosita() {
			this.luminosita--;
		}



	}

