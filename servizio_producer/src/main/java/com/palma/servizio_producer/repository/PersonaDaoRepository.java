package com.palma.servizio_producer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.kotlin.CoroutineCrudRepository;

import com.palma.servizio_producer.model.Persona;

public interface PersonaDaoRepository extends CrudRepository<Persona, Long> {

}
