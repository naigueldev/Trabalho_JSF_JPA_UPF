package br.upf.trabalhojpa.estoque;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: MateriaPrima
 *
 */
@Entity

public class MateriaPrima implements Serializable {

	   
	@Id
	private Integer id;
	
	@NotNull
	@Min(0)
	private Float estoqueMinimo;
	
	@NotNull
	@Min(value = 0)
//	Readonly
//	Gerado pelos movimentos de recebimento de matéria prima
	private Float ultimoCusto;
	
	@NotNull
	@Min(value = 0)
//	Readonly
//	Gerado pelos movimentos de recebimento de matéria prima
	private Float custoMedio;
	private Produto produto;
	private static final long serialVersionUID = 1L;

	public MateriaPrima() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Float getEstoqueMinimo() {
		return this.estoqueMinimo;
	}

	public void setEstoqueMinimo(Float estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}   
	public Float getUltimoCusto() {
		return this.ultimoCusto;
	}

	public void setUltimoCusto(Float ultimoCusto) {
		this.ultimoCusto = ultimoCusto;
	}   
	public Float getCustoMedio() {
		return this.custoMedio;
	}

	public void setCustoMedio(Float custoMedio) {
		this.custoMedio = custoMedio;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
   
}
