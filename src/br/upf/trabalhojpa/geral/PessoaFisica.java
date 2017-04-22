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
import org.hibernate.validator.constraints.br.CPF;

/**
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity

public class PessoaFisica implements Serializable {

	@Id
	private Integer id;
	
	@Pattern(regexp = "([0-9]{3}[.]?[0-9]{3}[.]?[0-9]{3}[-]?[0-9]{2})")
	@NotEmpty(message="O CPF é obrigatório.")
	@Length(min=14, max=14, message="O cnpj deve ter {max} caracteres.")
	@CPF
	private String cpf;
	
	@Length(min=10, max=20, message="O rg deve ter {max} caracteres.")
	@NotEmpty(message="O RG é obrigatório.")
	private String rg;
	
	@NotNull
	@Past
	private Date dataNascimento;
	
	private Pessoa pessoa;
	private static final long serialVersionUID = 1L;

	public PessoaFisica() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}   
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
   
}
