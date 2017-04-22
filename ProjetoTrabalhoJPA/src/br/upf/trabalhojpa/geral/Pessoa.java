package br.upf.trabalhojpa.geral;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity

public class Pessoa implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "genPessoaId")
	@SequenceGenerator(name = "genPessoaId", sequenceName = "seqPessoaId")
	private Integer id;
	
	@NotEmpty(message="O nome da pessoa é obrigatório.")
	@Length(min=2, max=60, message="O nome da pessoa deve ter {max} caracteres.")
	private String nome;
	
	@NotEmpty(message="O endereço é obrigatório.")
	@Length(min=0, max=10, message="O endereço deve ter {max} caracteres.")
	private String endereco;
	
	@Length(min=0, max=10, message="O número deve ter {max} caracteres.")
	private String numero;

	@Length(min=0, max=40, message="O complemento deve ter {max} caracteres.")
	private String complemento;
	
//	@Pattern(regexp="(^\\+(?:[0-9] ?){6,14}[0-9]$)")
//	@Pattern(regexp="(^$|[0-9]{10})")
	@Pattern(regexp = "([0-9]{2}[.]?[0-9]{3}[-]?[0-9]{3})")
	@Length(min=0, max=10, message="O cep deve ter {max} caracteres.")
	private String cep;
	
	@Length(min=0, max=40, message="O bairro deve ter {max} caracteres.")
	private String bairro;
	
	@Email
	@Length(min=0, max=80, message="O email deve ter {max} caracteres.")
	private String email;
	
	@Length(min=0, max=20, message="O telefone deve ter {max} caracteres.")
	private String telefone;
	
	@NotNull
	private Cidade cidade;
	
	private static final long serialVersionUID = 1L;

	public Pessoa() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}   
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}   
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}   
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}   
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

   
}
