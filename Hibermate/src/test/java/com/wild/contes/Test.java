package com.wild.contes;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wild.entity.DBUser;

public class Test {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		// 创建sessionFactory对象
		SessionFactory sf = config.buildSessionFactory();
		// 打开session，操作数据库
		Session session = sf.openSession();
		// 开启事务
		Transaction tran = session.beginTransaction();
		DBUser user = new DBUser(121, "Z", "JINAN", new Date());
		System.out.println(user);
		session.save(user);
		tran.commit();
	}
}
