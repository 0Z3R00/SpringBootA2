package br.usjt.JPAeHibernateParteII.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table (name = "tb_previsao")
@Data @AllArgsConstructor @NoArgsConstructor
public class Previsao{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false, length=200)
	private Double tempMin;
	@Column(nullable=false, length=200)
	private Double tempMax;
	@Column(nullable=false, length=200)
	private Double umiRelativa;
	@Column(nullable=false, length=200)
	private String descricao;
	
	@OneToOne(optional = false)
	@JoinColumn (name = "diaSemama")
	private DiaDaSemana diadasemana;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn (name = "cidade")
	private Cidades cidade;

	
	
}


