package br.upf.trabalhojpa.geral;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entity implementation class for Entity: Cidade
 *
 */
@Entity

public class Cidade implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "genCidadeId")
	@SequenceGenerator(name = "genCidadeId", sequenceName = "seqCidadeId", allocationSize = 1)
	private Integer id;
	
	@NotEmpty(message="O nome da cidade é obrigatório.")
	@Length(min=2, max=60, message="O nome da cidade deve ter {max} caracteres.")
	private String nome;
	
	@NotEmpty(message="A UF da cidade é obrigatória.")
	@Length(min=2, max=2, message="A UF da cidade deve ter {max} caracteres.")
	private String uf;
	private static final long serialVersionUID = 1L;

	public Cidade() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
   
}
