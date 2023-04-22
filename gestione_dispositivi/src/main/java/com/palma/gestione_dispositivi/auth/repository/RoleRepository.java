package com.palma.gestione_dispositivi.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.palma.gestione_dispositivi.auth.entity.ERole;
import com.palma.gestione_dispositivi.auth.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
