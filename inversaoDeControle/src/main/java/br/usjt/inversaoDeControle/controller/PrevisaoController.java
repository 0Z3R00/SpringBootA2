package br.usjt.inversaoDeControle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.inversaoDeControle.model.Previsao;
import br.usjt.inversaoDeControle.service.PrevisaoService;



@Controller
public class PrevisaoController {

	@Autowired
	private PrevisaoService previsaoService;

	@GetMapping("/previsoes")
	public ModelAndView listarPrevisao() {
		ModelAndView mv = new ModelAndView("lista_previsao");
		mv.addObject(new Previsao());
		List<Previsao> previsoes = previsaoService.listarTodos();
		mv.addObject("previsoes", previsoes);
		return mv;
	}

	@PostMapping("/previsoes")
	public String salvar(Previsao previsao) {
		previsaoService.salvar(previsao);
		return "redirect:/previsoes";
	}

}