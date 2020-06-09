package br.usjt.JPAeHibernateParteII;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.JPAeHibernateParteII.model.Cidades;
import br.usjt.JPAeHibernateParteII.model.DiaDaSemana;
import br.usjt.JPAeHibernateParteII.model.Previsao;
import br.usjt.JPAeHibernateParteII.repository.JPAUtil;

public class TesteRealizarInsert {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiaDaSemana d1 = new DiaDaSemana();
		d1.setDia("Segunda-Feira");
		manager.persist(d1);
		DiaDaSemana d2 = new DiaDaSemana();
		d2.setDia("Terça-Feira");
		manager.persist(d2);
		Cidades c = new Cidades();
		c.setLatitude(11.3);
		c.setLongitude(22.55);
		c.setNome("São Paulo");
		manager.persist(c);	
		List <Previsao> previsao = new ArrayList <>();
		Previsao p1 = new Previsao();
		p1.setDescricao("bonito");
		p1.setTempMax(11.3);
		p1.setTempMin(10.4);
		p1.setUmiRelativa(9.45);
		p1.setCidade(c);
		p1.setDiadasemana(d1);
		manager.persist(p1);
		Previsao p2 = new Previsao();
		p2.setDescricao("Já ta chovendo");
		p2.setTempMax(12.3);
		p2.setTempMin(8.4);
		p2.setUmiRelativa(7.3);
		p2.setCidade(c);
		p2.setDiadasemana(d2);
		manager.persist(p2);
		previsao.add(p1);
		previsao.add(p2);
		c.setPrevisao(previsao);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
