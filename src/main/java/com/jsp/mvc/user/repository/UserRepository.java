package com.jsp.mvc.user.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.jsp.mvc.user.entity.User;



@Repository
public class UserRepository {

	public Session getSession () {

		Configuration configuration = new Configuration().configure().addAnnotatedClass(User.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		return session;
	}

	public void addUser(User user) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();


		session.save(user);

		transaction.commit();
		session.close();

	}
}
