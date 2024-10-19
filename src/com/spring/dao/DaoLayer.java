package com.spring.dao;

import com.spring.model.User;

public interface DaoLayer {

	void registerDao(User user);

	User getAccDetailsDao(String id);

	User loginDao(String id, String pin);

	User depositeDao(String id, String pin, double depositeMoney);

	User withdrawDao(String id, String pin, double withdrawMoney);

}
