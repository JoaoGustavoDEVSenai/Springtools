package com.senai.JoaoGustavo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.JoaoGustavo.entities.Cliente;
import com.senai.JoaoGustavo.repositories.Repositorio;

@Service
public class ClienteService {
	
	private final Repositorio clienteRepositorio;
	
	@Autowired
	public ClienteService(Repositorio clienteRepositorio) {
		this.clienteRepositorio = clienteRepositorio;
	}
	
	public Cliente saveCliente(Cliente cliente) {
		return 	clienteRepositorio.save(cliente);
	}
	
	public Cliente getClienteById(Long idcCliente) {
		return 	clienteRepositorio.findById(idcCliente).orElse(null);
	}
	
	public List<Cliente> getAllCliente(){
		return clienteRepositorio.findAll();
	}
	
	public void deleteCliente(Long idcCliente) {
		clienteRepositorio.deleteById(idcCliente);
	}
}
