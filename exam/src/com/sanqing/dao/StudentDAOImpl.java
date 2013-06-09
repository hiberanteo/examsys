package com.sanqing.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sanqing.hibernate.HibernateSessionFactory;
import com.sanqing.po.Student;
import com.sanqing.po.Subject;

public class StudentDAOImpl implements StudentDAO{
	public void addStudent(Student student) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.save(student);//保存信息
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
		
	}

	public Student findByStudentID(String studentID) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		//Student student = (Student) session.get(Student.class, studentID);
		Query query = session.createQuery("from Student as stu where stu.studentID = ?");
		query.setString(0, studentID);
		List list = query.list();
		HibernateSessionFactory.closeSession();//关闭Session对象
		if(list.size() == 0) {
			return null;							//返回null
		}else {
			return (Student) list.get(0);			//返回第一个试题
		}
	}

	public void updateStudent(Student student) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.update(student);//更新学生信息
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}

	public List<Student> findByStudentName(String studentName) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Student as stu where stu.studentName = ?");
		query.setString(0, studentName);
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return list;
	}

	public List<Student> findByStudentClass(String sclass) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Student as stu where stu.sclass = ?");
		query.setString(0, sclass);
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return list;
	}

	public List<Student> findAllStudent() {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Student");
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return list;
	}

	public void deleteStudentById(int id) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Student student = (Student) session.get(Student.class, id);
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.delete(student);
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
		
	}

}
