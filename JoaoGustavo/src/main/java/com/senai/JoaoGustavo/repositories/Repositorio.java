package com.senai.JoaoGustavo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.JoaoGustavo.entities.Cliente;

public interface Repositorio extends JpaRepository<Cliente, Long> {
	
}
