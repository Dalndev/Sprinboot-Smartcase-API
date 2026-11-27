package com.dalndev.smartcase.adapters.repositories.cases;

import com.dalndev.smartcase.infrastructure.persistence.jpa.repositories.JPACaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JPACaseRepositoryAdapter {

    private final JPACaseRepository jpaCaseRepository;

}
