package br.com.aula.aulademo.repository;

import br.com.aula.aulademo.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContatoRepository extends JpaRepository<Contato, Long> {


}
