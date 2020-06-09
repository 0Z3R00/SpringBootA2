package br.usjt.jpaHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.usjt.jpaHibernate.model.DiaDaSemana;
import br.usjt.jpaHibernate.model.Previsao;
import br.usjt.jpaHibernate.repository.JPAUtil;


public class TesteInsereDiaDaSemanaComPrevisao {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		DiaDaSemana d = new DiaDaSemana ();
		d.setDia("Segunda-Fereira");
		manager.persist(d);
		Previsao p = new Previsao();
		p.setTempMax(12.0);
		p.setTempMin(16.0);
		p.setUmiRelativa(22.0);
		p.setDescricao("Simpatico");
		p.setLatitude(112.1);
		p.setLongitude(23.33);
		p.setDiaDaSemana(d);
		manager.persist(p);
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}
}
