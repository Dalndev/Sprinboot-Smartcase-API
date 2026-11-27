package com.dalndev.smartcase.infrastructure.persistence.jpa.repositories;

import com.dalndev.smartcase.infrastructure.persistence.jpa.entities.CaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dalndev
 *
 * @description
 * Representa la implementación
 * */
public interface JPACaseRepository extends JpaRepository<CaseEntity, String> {
}
