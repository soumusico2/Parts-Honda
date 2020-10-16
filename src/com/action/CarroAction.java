package com.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.carro.facade.CarroFacade;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("request")
public class CarroAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String ano;
	private String cambio;
	
	@Autowired
	private CarroFacade carroFacade;
	
	public String salvarCarro() {
		try {
			System.out.println("Passei pelo CarroAction");
			carroFacade.salvarCarro(nome, ano, cambio);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		return SUCCESS;
	}
	
	public String teste() {
		System.out.println("Bem vindo "+nome);
		
		return SUCCESS;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

}
