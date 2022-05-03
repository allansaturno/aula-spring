package br.com.aula.aulademo.repository;

import br.com.aula.aulademo.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
