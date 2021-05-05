package com.imoveis.flimoveis.controller;
import com.imoveis.flimoveis.model.Localidade;
import com.imoveis.flimoveis.service.LocalidadeSevice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping ("/localidade")
public class LocalidadeController {

    private final LocalidadeSevice localidadeSevice;

    public LocalidadeController(LocalidadeSevice localidadeSevice) {
        this.localidadeSevice = localidadeSevice;
    }

    @GetMapping
    public ResponseEntity <List<Localidade>> findAll () {
        return new ResponseEntity<>(this.localidadeSevice.findAll(), HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity <Localidade> findById (@PathVariable Long id) {
        return new ResponseEntity<>(this.localidadeSevice.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity <Localidade> create (@RequestBody Localidade localidade) {
        return new ResponseEntity<>(this.localidadeSevice.create(localidade), HttpStatus.CREATED);
    }

    @PutMapping ("/{id}")
    public ResponseEntity <Localidade> update (@PathVariable Long id, @RequestBody Localidade localidade){
        localidade = this.localidadeSevice.findById(id);
        return new ResponseEntity<>(this.localidadeSevice.update(localidade), HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity <String> delete (@PathVariable Long id){
        this.localidadeSevice.deleteById(id);
        return new ResponseEntity<>("Resource removed", HttpStatus.OK);
    }
}
