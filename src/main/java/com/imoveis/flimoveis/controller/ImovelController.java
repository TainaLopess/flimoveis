package com.imoveis.flimoveis.controller;
import com.imoveis.flimoveis.model.Imovel;
import com.imoveis.flimoveis.service.ImovelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping ("/imovel")
public class ImovelController {

    private final ImovelService imovelService;

    public ImovelController(ImovelService imovelService) {
        this.imovelService = imovelService;
    }

    @GetMapping
    public ResponseEntity<List<Imovel>> findAll () {
        return new ResponseEntity<>(this.imovelService.findAll(), HttpStatus.OK);
    }

    @GetMapping ("/{id}")
    public ResponseEntity <Imovel> findById (@PathVariable Long id) {
        return new ResponseEntity<>(this.imovelService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity <Imovel> create (@RequestBody Imovel imovel) {
        return new ResponseEntity<>(this.imovelService.create(imovel), HttpStatus.CREATED);
    }

    @PutMapping ("/{id}")
    public ResponseEntity <Imovel> update (@PathVariable Long id, @RequestBody Imovel imovel){
        imovel = this.imovelService.findById(id);
        return new ResponseEntity<>(this.imovelService.update(imovel), HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity <String> delete (@PathVariable Long id){
        this.imovelService.deleteById(id);
        return new ResponseEntity<>("Resource removed", HttpStatus.OK);
    }
}
