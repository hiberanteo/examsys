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
		Session session = HibernateSessionFactory.getSession();//���Session����
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.save(score);//����������Ϣ
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
	}

	public void deleteScore(int id) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Score score = (Score) session.get(Score.class, id);
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.delete(score);
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����

	}

	public List<Score> findAllScore() {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Score");
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}

	public List<Score> findBetween(float min, float max, int typeId) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Score as score where score.typeId=? and score.result<? and score.result>?");
		query.setInteger(0, typeId);
		query.setFloat(1, max);
		query.setFloat(2, min);
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}

	public List<Score> findByStuId(int stuId) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Score as score where score.stuId=?");
		query.setInteger(0, stuId);
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}

	public List<Score> findByTypeId(int typeId) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Score as score where score.typeId=?");
		query.setInteger(0, typeId);
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}

	public Score findScoreById(int id) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Score score = (Score) session.get(Score.class, id);
		HibernateSessionFactory.closeSession();		//�ر�Session����
		return score;
	}

	public void updateScore(Score score) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.update(score);//����������Ϣ
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����

	}

}
