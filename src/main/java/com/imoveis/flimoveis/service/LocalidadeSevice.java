package com.imoveis.flimoveis.service;

import com.imoveis.flimoveis.model.Localidade;

import java.util.List;

public interface LocalidadeSevice {

    List<Localidade> findAll();

    Localidade findById(Long id);

    Localidade create(Localidade localidade);

    Localidade update(Localidade localidade);

    void deleteById(Long id);
}
