package com.dalndev.smartcase.domain.entities.cases;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @author Dalndev
 *
 * @description
 * Representa la abstracción de la logica de negocio para la entidad caso (Case) en la
 * capa del dominio, donde se puede mapear la información basica asociada a un caso (negocio) a
 * una entidad del sistema.
 *
 * @see <a href="https://projectlombok.org/features/constructor">Lombok - @ArgsConstructor</a>
 * @see <a href="https://projectlombok.org/features/Data">Lombok - @Data</a>
 * @see <a href="https://projectlombok.org/features/Builder">Lombok - @Builder</a>
 * */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Case {

    /**
     * Identificador unico, generado y asociado al Caso.
     * */
    private String id;

    /**
     * Identificador interno definido en el Caso.
     * */
    private Integer caseNumber;

    /**
     * Alias personalizado definido por el usuario.
     * */
    private String alias;

    /**
     * Descripción asociado al caso.
     * */
    private String description;

    /**
     * Estado asociado al caso, define en que etapa del ciclo de vida
     * del caso se encuentra el caso.
     * */
    private CaseStatus caseStatus;

    /**
     * Fecha & Hora en el cual el caso fue creado. Utilizado para auditoria.
     * */
    private LocalDateTime createdAt;

    /**
     * Fecha & Hora en el cual el caso fue actualizado. Utilizado para auditoria.
     * */
    private LocalDateTime updatedAt;
}
