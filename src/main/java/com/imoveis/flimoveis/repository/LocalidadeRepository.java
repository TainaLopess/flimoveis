package com.imoveis.flimoveis.repository;

import com.imoveis.flimoveis.model.Localidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadeRepository extends JpaRepository <Localidade, Long> {
}
