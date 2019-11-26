package org.aprendendojavafx.crud.service;

import java.util.List;

import org.aprendendojavafx.crud.model.Conta;
import org.aprendendojavafx.crud.service.impl.ContasCSVService;
import org.aprendendojavafx.crud.service.impl.ContasDBService;


public interface ContasService {

	// CREATE
	public void salvar(Conta conta);
	
	// RETRIEVE
	public List<Conta> buscarTodas();

	public Conta buscaPorId(int id);
	
	// DELETE
	public void apagar(int id);
	
	// UPDATE
	public void atualizar(Conta conta);
	
	
	// retorna a implementacao que escolhemos - no nosso caso o ContasCSVService, 
	// mas poderia ser outro, como ContasDBService...
	public static ContasService getNewInstance() {
		// return new ContasCSVService();
		return new ContasDBService();
	}

}