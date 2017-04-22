package br.upf.trabalhojpa.estoque;

import java.io.Serializable;
import java.lang.Float;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProdutoAcabado
 *
 */
@Entity

public class ProdutoAcabado implements Serializable {

	@Id
	private Integer id;
	private Float quantidadeEmProducao;
	private Float quantidadeParaEntrega;
	private Produto produto;
	private static final long serialVersionUID = 1L;

	public ProdutoAcabado() {
		super();
	}  
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Float getQuantidadeEmProducao() {
		return this.quantidadeEmProducao;
	}

	public void setQuantidadeEmProducao(Float quantidadeEmProducao) {
		this.quantidadeEmProducao = quantidadeEmProducao;
	}   
	public Float getQuantidadeParaEntrega() {
		return this.quantidadeParaEntrega;
	}

	public void setQuantidadeParaEntrega(Float quantidadeParaEntrega) {
		this.quantidadeParaEntrega = quantidadeParaEntrega;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
   
}
