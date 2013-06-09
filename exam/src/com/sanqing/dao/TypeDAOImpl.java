package com.sanqing.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sanqing.hibernate.HibernateSessionFactory;
import com.sanqing.po.Type;

public class TypeDAOImpl implements TypeDAO {

	public Type findByTypeName(String name) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Type as type where type.name = ?");
		query.setString(0, name);
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();		//�ر�Session����
		if(list.size() == 0) {
			return null;							//����null
		}else {
			return (Type) list.get(0);			//���ص�һ������
		}
	}

	public List<Type> findAllType() {
		Session session = HibernateSessionFactory.getSession();// ���Session����
		Query query = session.createQuery("from Type");
		List list = query.list(); // ��ѯ������浽list��
		HibernateSessionFactory.closeSession(); // �ر�Session����
		return list;
	}

	public Type findByTypeId(int id) {
		Session session = HibernateSessionFactory.getSession();// ���Session����
		Type type = (Type) session.get(Type.class, id);
		HibernateSessionFactory.closeSession();// �ر�Session����
		return type;
	}

	public void updateType(Type type) {
		Session session = HibernateSessionFactory.getSession();// ���Session����
		Transaction transaction = null;// ����һ���������
		try {
			transaction = session.beginTransaction();// ��������
			session.update(type);// ����ѧ����Ϣ
			transaction.commit();// �ύ����
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();// ����ع�
		}
		HibernateSessionFactory.closeSession();// �ر�Session����

	}

	public void addType(Type type) {
		Session session = HibernateSessionFactory.getSession();// ���Session����
		Transaction transaction = null;// ����һ���������
		try {
			transaction = session.beginTransaction();// ��������
			session.save(type);// ������Ϣ
			transaction.commit();// �ύ����
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();// ����ع�
		}
		HibernateSessionFactory.closeSession();// �ر�Session����
	}
}
