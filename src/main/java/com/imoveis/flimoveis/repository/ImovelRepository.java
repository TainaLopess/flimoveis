package com.imoveis.flimoveis.repository;

import com.imoveis.flimoveis.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends JpaRepository <Imovel, Long> {
}
