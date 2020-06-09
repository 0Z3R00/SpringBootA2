package br.usjt.inversaoDeControle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.inversaoDeControle.model.Previsao;

public interface PrevisaoRepository extends JpaRepository<Previsao, Long>{

}