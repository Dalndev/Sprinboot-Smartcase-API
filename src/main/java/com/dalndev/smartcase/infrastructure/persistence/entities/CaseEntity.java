package com.dalndev.smartcase.infrastructure.persistence.entities;

import jakarta.persistence.Entity;

import java.time.LocalDateTime;


/**
 *
 * @see <a href="https://jakarta.ee/learn/docs/jakartaee-tutorial/current/persist/persistence-intro/persistence-intro.html#_entities">Jakarta EE - Entities</a>
 * */
@Entity
public class CaseEntity {

    private String id;

    private Integer caseNumber;

    private String alias;

    private String description;

    private String caseStatus;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
