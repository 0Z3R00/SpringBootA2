package br.usjt.JPAeHibernateParteII.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tb_cidade")
@Data @AllArgsConstructor @NoArgsConstructor
public class Cidades{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false, length=200)
	private String nome;

	@Column(nullable=false, length=200)
	private Double latitude;
	@Column(nullable=false, length=200)
	private Double longitude;
	
	@OneToMany(mappedBy = "cidade", cascade = CascadeType.ALL)
	private List<Previsao> previsao;

}
