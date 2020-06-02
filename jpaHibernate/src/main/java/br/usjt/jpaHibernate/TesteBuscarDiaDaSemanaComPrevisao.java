package br.usjt.jpaHibernate;

import javax.persistence.EntityManager;

import br.usjt.jpaHibernate.model.DiaDaSemana;
import br.usjt.jpaHibernate.repository.JPAUtil;

 class TesteBuscarDiaDaSemanaComPrevisao {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		DiaDaSemana d = manager.find(DiaDaSemana.class, 1L);
		System.out.println("====>"+d);
		manager.close();
		JPAUtil.close();
	}

}
