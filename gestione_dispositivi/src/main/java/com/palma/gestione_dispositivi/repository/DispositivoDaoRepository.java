package com.palma.gestione_dispositivi.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.palma.gestione_dispositivi.model.Dispositivo;
import com.palma.gestione_dispositivi.model.Stato;
//import com.palma.gestione_dispositivi.model.Stato;
//import com.palma.gestione_dispositivi.model.TipoDispositivo;
import com.palma.gestione_dispositivi.model.TipoDispositivo;

@Repository
public interface DispositivoDaoRepository extends CrudRepository<Dispositivo, Long> , PagingAndSortingRepository<Dispositivo, Long>{
	public Dispositivo findByTipoDispositivo(TipoDispositivo tipo);
	public Dispositivo findByStato(Stato stato);
}
