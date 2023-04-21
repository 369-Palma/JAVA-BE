package com.palma.gestione_dispositivi.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.palma.gestione_dispositivi.project.model.Dispositivo;

@Repository
public interface DispositivoDaoRepository extends CrudRepository<Dispositivo, Long>{

	
}
