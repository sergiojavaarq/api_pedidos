package br.com.cotiinformatica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.producers.PagamentoProducer;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {

	@Autowired
	private PagamentoProducer pagamentoProducer;

	@GetMapping("{message}")
	public String get(@PathVariable("message") String message) {
		pagamentoProducer.send(message);
		return "Dados enviados com sucesso!";
	}

}
