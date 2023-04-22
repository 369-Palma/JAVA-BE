package com.palma.gestione_dispositivi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.palma.gestione_dispositivi.model.Dipendente;

public interface DipendenteDaoRepository extends CrudRepository<Dipendente, Long> , PagingAndSortingRepository<Dipendente, Long>{
	public boolean existsByEmail(String email);
}
