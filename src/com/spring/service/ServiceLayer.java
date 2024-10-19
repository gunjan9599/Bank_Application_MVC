package com.spring.service;

import com.spring.model.User;

public interface ServiceLayer {

	void registerService(User user);

	User getAccDetails(String id);

	User loginService(String id, String pin);

	User depositeService(String id, String pin, double depositeMoney);

	User withdrawService(String id, String pin, double withdrawMoney);

}
