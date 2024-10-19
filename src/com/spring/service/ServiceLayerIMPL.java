package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.DaoLayer;
import com.spring.model.User;

@Service
public class ServiceLayerIMPL implements ServiceLayer {
	@Autowired
	private DaoLayer daolayer;

	@Override
	public User loginService(String id, String pin) {
		return daolayer.loginDao(id, pin);
	}

	@Override
	public User depositeService(String id, String pin, double depositeMoney) {
		System.out.println("deposit service");
		return daolayer.depositeDao(id, pin, depositeMoney);
		
	}

	@Override
	public User withdrawService(String id, String pin, double withdrawMoney) {
		// TODO Auto-generated method stub
		System.out.println("Withdraw Service");
		return daolayer.withdrawDao(id, pin, withdrawMoney);
	}

	@Override
	public void registerService(User user) {
		System.out.println("regiser service");

		daolayer.registerDao(user);
		
		
	}

	@Override
	public User getAccDetails(String id) {
		System.out.println("details service");

		return daolayer.getAccDetailsDao(id);
	}

}
