package br.upf.trabalhojpa.estoque;
import static javax.persistence.GenerationType.SEQUENCE;
import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import br.upf.trabalhojpa.geral.PessoaJuridica;

/**
 * Entity implementation class for Entity: Recebimento
 *
 */
@Entity

public class Recebimento implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
//	@GeneratedValue(strategy = SEQUENCE, generator = "genRecebimentoId")
//	@SequenceGenerator(name = "genRecebimentoId", sequenceName = "seqRecebimentoId")
	private Integer id;
	
	@NotNull
	@Past
	private Timestamp data;
	
	@NotEmpty(message="O número da nota é obrigatório.")
	@Length(min = 0, max = 10, message="O número da nota deve ter {max} caracteres.")
	private String numeroNota;
	
//	Calculado automaticamente pelos itens do recebimento
	@NotNull
	@DecimalMin(value="0",inclusive=false)
	private Float totalProdutos;
	
	@NotNull
	@DecimalMin(value="0",inclusive=false)
	private Float valorFrete;
	
	@NotNull
	@DecimalMin(value="0",inclusive=false)
//	Calculado automaticamente totalPtodutos + valorFrete
	private Float totalCompra;
	
	@NotNull
	private PessoaJuridica pessoaJuridica;
	
	@NotNull
	private RecebimentoItem recebimentoItem;
	
	@NotNull
	@Size(min = 1)
	@ElementCollection
	private List<RecebimentoItem> itensRecebidos = new ArrayList<RecebimentoItem>();
//	private List<RecebimentoItem> itensRecebidos;


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
	 
	public Timestamp getData() {
		return data;
	}
	public void setData(Timestamp data) {
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
	public List<RecebimentoItem> getItensRecebidos() {
		return itensRecebidos;
	}
	public void setItensRecebidos(List<RecebimentoItem> itensRecebidos) {
		this.itensRecebidos = itensRecebidos;
	}

	
	
	
	
	
   
}
