package br.upf.trabalhojpa.estoque;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Grupo
 *
 */
@Entity

public class Grupo implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "genGrupoId")
	@SequenceGenerator(name = "genGrupoId", sequenceName = "seqGrupoId")
	private Integer id;
	
	@NotEmpty(message="O nome é obrigatório.")
	@Length(min=2, max=60, message="O nome deve ter {max} caracteres.")
	private String nome;
	private static final long serialVersionUID = 1L;

	public Grupo() {
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
   
}
