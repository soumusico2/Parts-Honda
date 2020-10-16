package com.carro.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

@Repository
public class CarroDaoImpl implements CarroDao{
	
	@Autowired(required = false)
	@Qualifier("dataSource")
	private DataSource dataSource;
	private static final Logger LOGGER = LoggerFactory.getLogger(CarroDaoImpl.class);
	
	@Override
	public void salvarCarro(String nome, String ano, String cambio) {
		System.out.println("Passei pelo CarroDaoImpl");
		MapSqlParameterSource param = new MapSqlParameterSource();
		
		StringBuilder query = new StringBuilder();
		query.append("INSERT INTO estoque_honda.carros ");
		query.append("(nome, ano, cambio) ");
		query.append("VALUES ");
		query.append("(:nome, ano, cambio) ");
		
		param.addValue("nome", nome);
		param.addValue("ano", ano);
		param.addValue("cambio", cambio);

		try {
			new NamedParameterJdbcTemplate(dataSource).update(query.toString(), param);
		} catch (Exception e) {
			LOGGER.error("Não foi possível salvar os dados do carro no BD: " +e);
		}
	}
}
