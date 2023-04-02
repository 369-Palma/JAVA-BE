package ArchivioDEO;

import java.util.List;


import model.Pubblicazione;

public interface DEOarchivio {
	public void aggiungiPubblicazione (Pubblicazione p);
	public Pubblicazione findPubblicazioneByIsbn(Long isbn);
	public void eliminaPubblicazione(Pubblicazione p);
	public List <Pubblicazione> getAll();
	
}
