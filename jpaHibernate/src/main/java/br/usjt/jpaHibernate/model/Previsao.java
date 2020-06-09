package br.usjt.jpaHibernate.model;

import javax.persistence.Column;
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
	@Column(nullable=false, length=200)
	private Double latitude;
	@Column(nullable=false, length=200)
	private Double longitude;
	@OneToOne(optional = false)
	@JoinColumn (name = "diaDaSemana")
	private DiaDaSemana DiaDaSemana;
	
}


