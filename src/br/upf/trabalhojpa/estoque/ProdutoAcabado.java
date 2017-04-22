package br.upf.trabalhojpa.estoque;

import java.io.Serializable;
import java.lang.Float;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: ProdutoAcabado
 *
 */
@Entity

public class ProdutoAcabado implements Serializable {

	@Id
	private Integer id;
	
	@NotNull
	@Min(0)
//	Readonly , Gerado pelos movimentos da produ��o de lote. Lotes iniciados e ainda n�o finalizados
	private Float quantidadeEmProducao;
	
	@NotNull
	@Min(0)
//	Readonly, Gerado pelos movimentos da produ��o de lote e entrega. Lotes iniciados e finalizados e ainda n�o entregues.
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
