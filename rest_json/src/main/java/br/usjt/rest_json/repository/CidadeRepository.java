package br.usjt.rest_json.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.rest_json.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

	Cidade findByLongitudeAndLatitude(double longitude, double latitude);
}
