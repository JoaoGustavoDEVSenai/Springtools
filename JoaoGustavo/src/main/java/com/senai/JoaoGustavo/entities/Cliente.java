package com.senai.JoaoGustavo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="cliente")
public class Cliente {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column (name = "Cliente")
	private String nCliente;
	
	@Column (name = "Fone")
	private String fone;
	
	//GETTERS
	//SETTERS
	
	public Long getIdcCliente() {
		return idcCliente;
	}
	
	public void setIdcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}
	
	public String getnCliente() {
		return nCliente;
	}
	
	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
}
