package com.sanqing.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sanqing.hibernate.HibernateSessionFactory;
import com.sanqing.po.Type;

public class TypeDAOImpl implements TypeDAO {

	public Type findByTypeName(String name) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Type as type where type.name = ?");
		query.setString(0, name);
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();		//关闭Session对象
		if(list.size() == 0) {
			return null;							//返回null
		}else {
			return (Type) list.get(0);			//返回第一个试题
		}
	}

	public List<Type> findAllType() {
		Session session = HibernateSessionFactory.getSession();// 获得Session对象
		Query query = session.createQuery("from Type");
		List list = query.list(); // 查询结果保存到list中
		HibernateSessionFactory.closeSession(); // 关闭Session对象
		return list;
	}

	public Type findByTypeId(int id) {
		Session session = HibernateSessionFactory.getSession();// 获得Session对象
		Type type = (Type) session.get(Type.class, id);
		HibernateSessionFactory.closeSession();// 关闭Session对象
		return type;
	}

	public void updateType(Type type) {
		Session session = HibernateSessionFactory.getSession();// 获得Session对象
		Transaction transaction = null;// 声明一个事务对象
		try {
			transaction = session.beginTransaction();// 开启事务
			session.update(type);// 更新学生信息
			transaction.commit();// 提交事务
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();// 事务回滚
		}
		HibernateSessionFactory.closeSession();// 关闭Session对象

	}

	public void addType(Type type) {
		Session session = HibernateSessionFactory.getSession();// 获得Session对象
		Transaction transaction = null;// 声明一个事务对象
		try {
			transaction = session.beginTransaction();// 开启事务
			session.save(type);// 保存信息
			transaction.commit();// 提交事务
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();// 事务回滚
		}
		HibernateSessionFactory.closeSession();// 关闭Session对象
	}
}
