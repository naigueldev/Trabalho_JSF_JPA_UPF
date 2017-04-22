package br.upf.trabalhojpa.geral;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CNPJ;

/**
 * Entity implementation class for Entity: PessoaJuridica
 *
 */
@Entity

public class PessoaJuridica implements Serializable {

	   
	@Id
	private Integer id;
	
	@Pattern(regexp = "([0-9]{2}[.]?[0-9]{3}[.]?[0-9]{3}[/]?[0-9]{4}[-]?[0-9]{2})")
	@NotEmpty(message="O cnpj é obrigatório.")
	@Length(min=18, max=18, message="O cnpj deve ter {max} caracteres.")
	@CNPJ
	private String cnpj;
	
	@NotEmpty(message="A Inscrição Estadual é obrigatório.")
	@Length(min=0, max=20, message="A Inscrição Estadual deve ter {max} caracteres.")
	private String ie;
	
	@NotNull
//	Checks whether the annotated date is in the past
	@Past
	private Date dataConstituicao;
	
	private Pessoa pessoa;
	private static final long serialVersionUID = 1L;

	public PessoaJuridica() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}   
	public String getIe() {
		return this.ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}   
	public Date getDataConstituicao() {
		return this.dataConstituicao;
	}

	public void setDataConstituicao(Date dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
   
}
