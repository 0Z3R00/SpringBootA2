package br.usjt.JPAeHibernateParteII.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
