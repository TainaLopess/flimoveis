package com.imoveis.flimoveis.service;

import com.imoveis.flimoveis.model.Imovel;

import java.util.List;

public interface ImovelService {

    List<Imovel> findAll();

    Imovel findById(Long id);

    Imovel create(Imovel imovel);

    Imovel update(Imovel imovel);

    void deleteById(Long id);
}
