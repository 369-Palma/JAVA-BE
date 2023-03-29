import java.time.LocalDate;

import util.Evento;
import util.EventoDAO;
import util.TipoEvento;

public class MainEvents {

	public static void main(String[] args) {
	
		//creo evento
		
		
				Evento e = new Evento();
				e.setTitolo("Festa di primavera");
				e.setDataEvento(LocalDate.of(1980, 10, 10));
				e.setDescrizione("Caccia al tesoro a tema natura e giochi di primavera");
				e.setTipoEvento(TipoEvento.PUBBLICO);
				e.setNumeroMassimoPartecipanti(15);
				
				//salva evento
//				EventoDAO ed = new EventoDAO();
//				ed.save(e);
				
				//leggere evento 
				EventoDAO el = new EventoDAO();
				Evento evLetto = el.getById(1l);
				
				//modifica evento
				Evento ev = new Evento();
				evLetto.setTipoEvento(TipoEvento.PRIVATO);
				EventoDAO.updateEvent(ev);
				
				//cancella evento
				
	}

}
