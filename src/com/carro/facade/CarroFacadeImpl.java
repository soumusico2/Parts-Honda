package com.carro.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.carro.dao.CarroDao;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class CarroFacadeImpl implements CarroFacade{
	
	@Autowired
	private CarroDao carroDao;
	
	@Override
	public void salvarCarro(String nome, String ano, String cambio) {
		System.out.println("Passei pelo CarroFacadeImpl");
		carroDao.salvarCarro(nome, ano, cambio);
	}

}
