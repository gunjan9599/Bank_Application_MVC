package com.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.User;

@Repository
public class DaoLayerIMPL implements DaoLayer {

	@Autowired
	private SessionFactory sf;

	@Override
	public User loginDao(String id, String pin) {
		Session session = sf.openSession();
		User user = session.get(User.class, id);
		return user;
	}

	@Override
	public User depositeDao(String id, String pin, double depositeMoney) {
		System.out.println("deposit dao ");
		Session session = sf.openSession();
		User user = session.get(User.class, id);
		if (user != null) {
			user.setDepositeAmount(user.getDepositeAmount() + depositeMoney);
			session.update(user);
			session.save(user);
			session.beginTransaction().commit();

		}

		return user;
	}

	@Override
	public User withdrawDao(String id, String pin, double withdrawMoney) {
		System.out.println("Withdarw dao");
	Session session	=sf.openSession();
	User user=session.get(User.class, id);
	if (user !=null) {
		user.setDepositeAmount(user.getDepositeAmount()-withdrawMoney);
		session.update(user);
		session.save(user);
		session.beginTransaction().commit();
	}
		return user;
	}

	@Override
	public void registerDao(User user) {
		System.out.println("regiser dao");

		Session session = sf.openSession();
		session.save(user);
		System.out.println("regiser dao1");

		session.beginTransaction().commit();

	}

	@Override
	public User getAccDetailsDao(String id) {
		System.out.println("details dao");

		Session session = sf.getCurrentSession();
		return session.load(User.class, id);

	}

}
