package br.com.fiap.acidentes.service;

import br.com.fiap.acidentes.model.Acidente;
import br.com.fiap.acidentes.repository.AcidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcidenteService {

    @Autowired
    private AcidenteRepository acidenteRepository;

    public Acidente criar(Acidente acidente){
        return acidenteRepository.save(acidente);
    }

    public void excluir(Long id){
        Optional<Acidente> acidenteOptional = acidenteRepository.findById(id);

        if(acidenteOptional.isPresent()){
            acidenteRepository.delete(acidenteOptional.get());
        }
        else{
            throw new RuntimeException("Acidente não encontrado!");
        }
    }

    public Acidente atualizar(Acidente acidente){
        Optional<Acidente> acidenteOptional = acidenteRepository.findById(acidente.getId());

        if(acidenteOptional.isPresent()){
            return acidenteRepository.save(acidente);
        }
        else{
            throw new RuntimeException("Acidente não encontrado!");
        }
    }

    public List<Acidente> listarTodosAcidentes(){
        return acidenteRepository.findAll();
    }
}
