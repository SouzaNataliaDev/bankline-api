package com.dio.santander.bankline.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_correntista")
public class Correntista {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String cpf;
private String nome;

@Embedded //informa que as informações estarão na Classe conta estarão nessa tabela.

private Conta conta;

public Conta getConta() {
	return conta;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}


}