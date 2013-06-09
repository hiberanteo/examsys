package com.sanqing.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sanqing.hibernate.HibernateSessionFactory;
import com.sanqing.po.Score;
import com.sanqing.po.Subject;

public class ScoreDAOImpl implements ScoreDAO {

	public void addScore(Score score) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.save(score);//保存试题信息
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}

	public void deleteScore(int id) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Score score = (Score) session.get(Score.class, id);
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.delete(score);
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象

	}

	public List<Score> findAllScore() {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Score");
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	public List<Score> findBetween(float min, float max, int typeId) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Score as score where score.typeId=? and score.result<? and score.result>?");
		query.setInteger(0, typeId);
		query.setFloat(1, max);
		query.setFloat(2, min);
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	public List<Score> findByStuId(int stuId) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Score as score where score.stuId=?");
		query.setInteger(0, stuId);
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	public List<Score> findByTypeId(int typeId) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Score as score where score.typeId=?");
		query.setInteger(0, typeId);
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	public Score findScoreById(int id) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Score score = (Score) session.get(Score.class, id);
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return score;
	}

	public void updateScore(Score score) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.update(score);//更新试题信息
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象

	}

}
