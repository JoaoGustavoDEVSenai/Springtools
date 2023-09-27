package com.senai.JoaoGustavo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.JoaoGustavo.entities.Cliente;
import com.senai.JoaoGustavo.service.ClienteService;

@RestController
@RequestMapping("/clientes")

public class Controllers {
	private final ClienteService clienteService;
	
	@Autowired
	public Controllers (ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteService.saveCliente(cliente);
	}
	
	@GetMapping("/{idcCliente}")
	public Cliente getCliente(@PathVariable Long idcCliente) {
		return clienteService.getClienteById(idcCliente);
	}
	
	@GetMapping
	public List<Cliente> getAllCliente(){
		return clienteService.getAllCliente();
	}
	
	@DeleteMapping("/{idcCliente}")
	public void deleteCliente(@PathVariable Long idcCliente) {
		clienteService.deleteCliente(idcCliente);
	}
}
