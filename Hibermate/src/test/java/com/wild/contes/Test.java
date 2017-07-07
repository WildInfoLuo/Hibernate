package com.wild.contes;

import java.util.Date;

import org.hibernate.Session;

import com.wild.entity.DBUser;
import com.wild.other.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		DBUser user = new DBUser();

		user.setUserId(101);
		user.setUsername("superman");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());

		session.save(user);
		session.getTransaction().commit();
		System.out.println(user);
	}
}
