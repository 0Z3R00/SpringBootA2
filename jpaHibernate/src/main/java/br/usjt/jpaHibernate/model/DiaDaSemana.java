package br.usjt.jpaHibernate.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tb_dia_da_semana")
@Data @NoArgsConstructor @AllArgsConstructor
public class DiaDaSemana {
	@Id
	@GeneratedValue
	private Long id;
	private String dia;
	
}
