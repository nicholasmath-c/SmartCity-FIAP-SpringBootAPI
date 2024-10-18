package br.com.fiap.acidentes.repository;

import br.com.fiap.acidentes.model.Acidente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcidenteRepository extends JpaRepository<Acidente, Long> {

}
