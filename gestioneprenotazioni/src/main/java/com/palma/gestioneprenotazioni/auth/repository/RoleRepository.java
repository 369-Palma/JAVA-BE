package com.palma.gestioneprenotazioni.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.palma.gestioneprenotazioni.auth.entity.ERole;
import com.palma.gestioneprenotazioni.auth.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
