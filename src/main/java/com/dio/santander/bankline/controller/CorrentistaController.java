package com.dio.santander.bankline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.dto.NovoCorrentista;
import com.dio.santander.bankline.model.Correntista;
import com.dio.santander.bankline.repository.CorrentistaRepository;
import com.dio.santander.bankline.service.CorrentistaService;

@RestController
@RequestMapping ("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	@Autowired
	private CorrentistaService correntistaService;
	
	@GetMapping
	public List <Correntista> findAll(){
	return correntistaRepository.findAll();
}
	@PostMapping
	public void save(@RequestBody NovoCorrentista novoCorrentista) {
		correntistaService.save(novoCorrentista);
	}
}
