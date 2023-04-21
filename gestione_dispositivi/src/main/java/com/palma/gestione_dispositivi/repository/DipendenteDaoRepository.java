package com.palma.gestione_dispositivi.repository;

import org.springframework.data.repository.CrudRepository;

import com.palma.gestione_dispositivi.model.Dipendente;

public interface DipendenteDaoRepository extends CrudRepository<Dipendente, Long> {
	public boolean existsByEmail(String email);
}
