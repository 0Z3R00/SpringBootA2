package br.usjt.jpaHibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.usjt.jpaHibernate.model.DiaDaSemana;
import br.usjt.jpaHibernate.model.Previsao;
import br.usjt.jpaHibernate.repository.JPAUtil;

public class TesteListarTodasPrvisoes {
	public static void main(String[] args) {
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
