package br.com.fiap.acidentes.controller;

import br.com.fiap.acidentes.model.Acidente;
import br.com.fiap.acidentes.service.AcidenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AcidenteController {

    @Autowired
    private AcidenteService service;

    @PostMapping("/acidentes")
    @ResponseStatus(HttpStatus.CREATED)
    public Acidente criar(@RequestBody Acidente acidente){
        return service.criar(acidente);
    }

    @GetMapping("/acidentes")
    @ResponseStatus(HttpStatus.OK)
    public List<Acidente> listarTodosAcidentes(){
        return service.listarTodosAcidentes();
    }

    @DeleteMapping("/acidentes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long id){
        service.excluir(id);
    }

    @PutMapping("/acidentes")
    @ResponseStatus(HttpStatus.OK)
    public Acidente atualizar(Acidente acidente){
        return service.atualizar(acidente);
    }
}
