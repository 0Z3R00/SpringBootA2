package br.usjt.JPAeHibernateParteII;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.usjt.JPAeHibernateParteII.model.Cidades;
import br.usjt.JPAeHibernateParteII.model.DiaDaSemana;
import br.usjt.JPAeHibernateParteII.model.Previsao;
import br.usjt.JPAeHibernateParteII.repository.JPAUtil;

class TesteBuscaCidade {
	public static void main(String[] args) {
		/*
		EntityManager manager = JPAUtil.getEntityManager();
		Previsao c = manager.find(Previsao.class, 1L);
		System.out.println(c.getDiadasemana());
		System.out.println(c.getCidade());
		manager.close();
		JPAUtil.close();
		*/
		EntityManager manager = JPAUtil.getEntityManager();
		Query query = manager.createQuery("from Previsao");
		List <Previsao> dia = query.getResultList();
		for (Previsao d : dia) {
			System.out.println("=====>"+d);
		}
		manager.close();
		JPAUtil.close();
	}

}
