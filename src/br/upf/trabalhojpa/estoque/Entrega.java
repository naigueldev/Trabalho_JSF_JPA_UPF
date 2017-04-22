package br.upf.trabalhojpa.estoque;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

import br.upf.trabalhojpa.geral.Pessoa;
import br.upf.trabalhojpa.producao.ProducaoLote;

/**
 * Entity implementation class for Entity: Entrega
 *
 */
@Entity

public class Entrega implements Serializable {

	   
	@Id
	private Integer id;
	private Date data;
	private String numeroNota;
	private Float quantidade;
	private Pessoa pessoa;
	private ProdutoAcabado produtoAcabado;
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
