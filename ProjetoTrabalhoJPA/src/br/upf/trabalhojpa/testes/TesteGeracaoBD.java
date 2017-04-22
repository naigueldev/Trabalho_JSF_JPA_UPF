package br.upf.trabalhojpa.testes;

import javax.persistence.Persistence;

public class TesteGeracaoBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence.createEntityManagerFactory("ProjetoTrabalhoJPA");
	}

}
