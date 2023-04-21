package com.palma.gestione_dispositivi.repository;


import org.springframework.data.repository.CrudRepository;

import com.palma.gestione_dispositivi.model.Dispositivo;
import com.palma.gestione_dispositivi.model.Stato;
import com.palma.gestione_dispositivi.model.TipoDispositivo;

public interface DispositivoDaoRepository extends CrudRepository<Dispositivo, Long> {
//	public Dispositivo findByTipoDispositivo(TipoDispositivo tipo);
//	public Dispositivo findByStato(Stato stato);
}
