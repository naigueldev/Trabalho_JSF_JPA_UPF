package br.upf.trabalhojpa.estoque;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: RecebimentoItem
 *
 */
@Entity

public class RecebimentoItem implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
//	Maior que zero
//	Ao atualizar este dado, atualizar a quantidade em estoque no produto
	@NotNull
	@DecimalMin(value="0",inclusive=false)
	private Float quantidade;
	
//	Maior que zero
//	Ao informar, atualizar último custo e custo médio na matéria prima.
	@NotNull
	@DecimalMin(value="0",inclusive=false)
	private Float valorUnitario;
	
//	Transient.
//	Calculado: quantidade * vrlUnitario
	@NotNull
	@DecimalMin(value="0",inclusive=false)
	private Float total;
	
	@NotNull
	private MateriaPrima materiaPrima;
	
	@NotNull
	private Recebimento recebimento;
	
	private static final long serialVersionUID = 1L;

	public RecebimentoItem() {
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
	public Float getValorUnitario() {
		return this.valorUnitario;
	}

	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}   
	public Float getTotal() {
		return this.total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}   
	public MateriaPrima getMateriaPrima() {
		return this.materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
   
}
