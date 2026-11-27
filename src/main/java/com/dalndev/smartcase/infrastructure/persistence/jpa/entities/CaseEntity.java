package com.dalndev.smartcase.infrastructure.persistence.jpa.entities;

import com.dalndev.smartcase.domain.entities.cases.CaseStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;


/**
 * @author Dalndev
 *
 * @description
 * Representa la persistencia de la entidad caso (Case) en la capa de infraestructura mediante la implementación de
 * JPA (Jakarta Persistence API) donde las instancias son mapeadas a registros de una tabla
 * en una base de datos (Servicio Externo) mediante un proveedor de persistencia (Hibernate)
 * .
 *
 * @see <a href="https://jakarta.ee/learn/docs/jakartaee-tutorial/current/persist/persistence-intro/persistence-intro.html#_entities">Jakarta EE - Entities</a>
 * */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "case")
public class CaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "case_id", unique = true)
    private String id;

    @Column(name = "case_number")
    private Integer caseNumber;

    @Column(name = "title")
    private String title;

    @Column(name = "alias")
    private String alias;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private CaseStatus caseStatus;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
