package br.upf.trabalhojpa.estoque;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

import br.upf.trabalhojpa.geral.PessoaJuridica;

/**
 * Entity implementation class for Entity: Recebimento
 *
 */
@Entity

public class Recebimento implements Serializable {

	   
	@Id
	private Integer id;
	private Date data;
	private String numeroNota;
	private Float totalProdutos;
	private Float valorFrete;
	private Float totalCompra;
	private PessoaJuridica pessoaJuridica;
	private RecebimentoItem recebimentoItem;
	private static final long serialVersionUID = 1L;

	public Recebimento() {
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
	public Float getTotalProdutos() {
		return this.totalProdutos;
	}

	public void setTotalProdutos(Float totalProdutos) {
		this.totalProdutos = totalProdutos;
	}   
	public Float getValorFrete() {
		return this.valorFrete;
	}

	public void setValorFrete(Float valorFrete) {
		this.valorFrete = valorFrete;
	}   
	public Float getTotalCompra() {
		return this.totalCompra;
	}

	public void setTotalCompra(Float totalCompra) {
		this.totalCompra = totalCompra;
	}
	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}
	public RecebimentoItem getRecebimentoItem() {
		return recebimentoItem;
	}
	public void setRecebimentoItem(RecebimentoItem recebimentoItem) {
		this.recebimentoItem = recebimentoItem;
	}
	
	
	
	
   
}
