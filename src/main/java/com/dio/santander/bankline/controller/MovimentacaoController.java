package com.dio.santander.bankline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.dto.NovaMovimentacao;
import com.dio.santander.bankline.model.Movimentacao;
import com.dio.santander.bankline.repository.MovimentacaoRepository;
import com.dio.santander.bankline.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

	@Autowired
	private MovimentacaoRepository movimentacaoRepository;

	@Autowired
	private MovimentacaoService movimentacaoService;

	@GetMapping
	public List<Movimentacao> findAll() {
		return movimentacaoRepository.findAll();
	}

	@PostMapping
	public void save(@RequestBody NovaMovimentacao novaMovimentacao) {
		movimentacaoService.save(novaMovimentacao);
	}
}