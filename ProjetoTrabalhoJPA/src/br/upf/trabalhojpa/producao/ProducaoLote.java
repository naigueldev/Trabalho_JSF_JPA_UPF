package br.upf.trabalhojpa.producao;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

import br.upf.trabalhojpa.estoque.ProdutoAcabado;

/**
 * Entity implementation class for Entity: ProducaoLote
 *
 */
@Entity

public class ProducaoLote implements Serializable {

	   
	@Id
	private Integer id;
	private Date dataInicioProducao;
	private Float custoMateriaPrima;
	private Date dataFinalProducao;
	private Float quantidadeProduzida;
	private Float custoUnitario;
	private MateriaPrimaUsada materiaPrimaUsada;
	private ProdutoAcabado produtoAcabado;
	private static final long serialVersionUID = 1L;

	public ProducaoLote() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getDataInicioProducao() {
		return this.dataInicioProducao;
	}

	public void setDataInicioProducao(Date dataInicioProducao) {
		this.dataInicioProducao = dataInicioProducao;
	}   
	public Float getCustoMateriaPrima() {
		return this.custoMateriaPrima;
	}

	public void setCustoMateriaPrima(Float custoMateriaPrima) {
		this.custoMateriaPrima = custoMateriaPrima;
	}   
	public Date getDataFinalProducao() {
		return this.dataFinalProducao;
	}

	public void setDataFinalProducao(Date dataFinalProducao) {
		this.dataFinalProducao = dataFinalProducao;
	}   
	public Float getQuantidadeProduzida() {
		return this.quantidadeProduzida;
	}

	public void setQuantidadeProduzida(Float quantidadeProduzida) {
		this.quantidadeProduzida = quantidadeProduzida;
	}   
	public Float getCustoUnitario() {
		return this.custoUnitario;
	}

	public void setCustoUnitario(Float custoUnitario) {
		this.custoUnitario = custoUnitario;
	}   
	public MateriaPrimaUsada getMateriaPrimaUsada() {
		return this.materiaPrimaUsada;
	}

	public void setMateriaPrimaUsada(MateriaPrimaUsada materiaPrimaUsada) {
		this.materiaPrimaUsada = materiaPrimaUsada;
	}   
	public ProdutoAcabado getProdutoAcabado() {
		return this.produtoAcabado;
	}

	public void setProdutoAcabado(ProdutoAcabado produtoAcabado) {
		this.produtoAcabado = produtoAcabado;
	}
   
}
