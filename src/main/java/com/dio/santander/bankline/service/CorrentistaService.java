package com.dio.santander.bankline.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankline.dto.NovoCorrentista;
import com.dio.santander.bankline.model.Conta;
import com.dio.santander.bankline.model.Correntista;
import com.dio.santander.bankline.repository.CorrentistaRepository;
@Service
public class CorrentistaService {
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	
public void save (NovoCorrentista novoCorrentista) {
	
	Correntista correntista = new Correntista();
	correntista.setCpf(novoCorrentista.getCpf());
	correntista.setNome(novoCorrentista.getNome());
	
	Conta conta = new Conta(); //está criando uma nova conta.
	conta.setSaldo(0.0);
	conta.setNumero(new Date().getTime());
	
	correntista.setConta(conta);
	correntistaRepository.save(correntista);
}
}
