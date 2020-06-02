package br.usjt.inversaoDeControle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.inversaoDeControle.model.Previsao;
import br.usjt.inversaoDeControle.repository.PrevisaoRepository;


@Service
public class PrevisaoService {
	@Autowired
	private PrevisaoRepository previsaoRepo;

	public void salvar(Previsao previsao) {
		previsaoRepo.save(previsao);
	}
	
	public List<Previsao> listarTodos(){
		List<Previsao> previsao = previsaoRepo.findAll();
		return previsao;
	}
     
}