package br.upf.trabalhojpa.producao;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.util.Date;

import javax.persistence.*;

import br.upf.trabalhojpa.estoque.MateriaPrima;

/**
 * Entity implementation class for Entity: MateriaPrimaUsada
 *
 */
@Entity

public class MateriaPrimaUsada implements Serializable {

	   
	@Id
	private Integer id;
	private Float quantidade;
	private Float custoUnitario;
	private Date dataUso;
	private Float custoTotal;
	private MateriaPrima materiaPrima;
	private static final long serialVersionUID = 1L;

	public MateriaPrimaUsada() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Float getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}   
	public Float getCustoUnitario() {
		return this.custoUnitario;
	}

	public void setCustoUnitario(Float custoUnitario) {
		this.custoUnitario = custoUnitario;
	}   
	public Date getDataUso() {
		return this.dataUso;
	}

	public void setDataUso(Date dataUso) {
		this.dataUso = dataUso;
	}   
	public Float getCustoTotal() {
		return this.custoTotal;
	}

	public void setCustoTotal(Float custoTotal) {
		this.custoTotal = custoTotal;
	}   
	public MateriaPrima getMateriaPrima() {
		return this.materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
   
}
