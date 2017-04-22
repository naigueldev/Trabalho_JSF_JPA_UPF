package br.upf.trabalhojpa.estoque;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Produto
 *
 */
@Entity

public class Produto implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	@NotEmpty(message="O nome do produto é obrigatório.")
	@Length(min=2, max=60, message="O nome do produto deve ter {max} caracteres.")
	private String nome;
	
	@NotEmpty(message="A Unidade Estoque é obrigatório.")
	@Length(min=1, max=10, message="O nome do produto deve ter {max} caracteres.")
	private String unidadeEstoque;
	
	@NotNull
	@Min(value=0)
	@Pattern(regexp="0")
//	READONLY, Gerado pelos movimentos de recebimento e entrega
	private Float quantidadeEstoque;
	
	@NotNull
	private Grupo grupo;
	private static final long serialVersionUID = 1L;

	public Produto() {
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
	public String getUnidadeEstoque() {
		return this.unidadeEstoque;
	}

	public void setUnidadeEstoque(String unidadeEstoque) {
		this.unidadeEstoque = unidadeEstoque;
	}   
	public Float getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Float quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	
   
}
