package com.dalndev.smartcase.domain.repositories;

import com.dalndev.smartcase.domain.models.cases.Case;

import java.util.ArrayList;

/**
 * @author Dalndev
 *
 * @description
 * Definición/Contrato de implementación de los metodos de interacción con
 * la información definida en el dominio para la entidad caso (Case). Permite
 * establecer los métodos de transformación para los casos.
 *
 * */
public interface CaseRepository {

    /**
     * Metodo para recuperar todos los casos registrados en el sistema.
     * */
    ArrayList<Case> findAll();

    /**
     * Metodo para recuperar un caso especificando el ID asociado al mismo.
     * */
    Case findById(String id);

    /**
     * Metodo para registrar un caso en el sistema.
     * */
    Case createCase(Case payload);

    /**
     * Metodo para actualizar un caso en el sistema, especificando el ID asociado
     * al mismo a modo de filtro.
     * */
    Case updateCase(String id, Case payload);

    /**
     * Metodo para eliminar un caso del sistema, especificando el ID asociado al mismo.
     * */
    Case deleteById(String id);
}
