package br.upf.trabalhojpa.estoque;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import br.upf.trabalhojpa.geral.Pessoa;
import br.upf.trabalhojpa.producao.ProducaoLote;

/**
 * Entity implementation class for Entity: Entrega
 *
 */
@Entity

public class Entrega implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	@NotNull
	private Date data = new Date();
	
	@NotEmpty(message="O número da nota é obrigatório.")
	@Length(min = 0, max = 10, message="O número da nota deve ter {max} caracteres.")
	private String numeroNota;
	
//	Ao atualizar este dado, deve atualizar a quantidade para entrega no produto acabado
	@NotNull
	@DecimalMin(value="0",inclusive=false)
	private Float quantidade;
	
	@NotNull
	private Pessoa pessoa;
	@NotNull
	private ProdutoAcabado produtoAcabado;
	@NotNull
	private ProducaoLote producaoLote;
	
	private static final long serialVersionUID = 1L;

	public Entrega() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}   
	public String getNumeroNota() {
		return this.numeroNota;
	}

	public void setNumeroNota(String numeroNota) {
		this.numeroNota = numeroNota;
	}   
	public Float getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public ProdutoAcabado getProdutoAcabado() {
		return produtoAcabado;
	}
	public void setProdutoAcabado(ProdutoAcabado produtoAcabado) {
		this.produtoAcabado = produtoAcabado;
	}
	public ProducaoLote getProducaoLote() {
		return producaoLote;
	}
	public void setProducaoLote(ProducaoLote producaoLote) {
		this.producaoLote = producaoLote;
	}
	
		
   
}
