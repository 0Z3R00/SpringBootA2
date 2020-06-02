package br.usjt.jpaHibernate;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("JPAHibernate");
		}

}
