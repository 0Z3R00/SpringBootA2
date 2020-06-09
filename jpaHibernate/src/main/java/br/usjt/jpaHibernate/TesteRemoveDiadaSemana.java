package br.usjt.jpaHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


import br.usjt.jpaHibernate.model.DiaDaSemana;
import br.usjt.jpaHibernate.repository.JPAUtil;

public class TesteRemoveDiadaSemana {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiaDaSemana p = manager.find(DiaDaSemana.class, 1L);
		manager.remove(p);
		manager.close();
		JPAUtil.close();
	}

}
