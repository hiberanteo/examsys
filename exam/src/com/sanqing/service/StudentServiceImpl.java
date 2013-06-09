package com.sanqing.service;

import java.util.List;

import com.sanqing.dao.StudentDAO;
import com.sanqing.dao.StudentDAOImpl;
import com.sanqing.po.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO = new StudentDAOImpl();
	public void deleteStudentById(int id) {
		studentDAO.deleteStudentById(id);	
	}

	public Student findStudentById(String studentId) {
		Student student = null;
		student = studentDAO.findByStudentID(studentId);
		return student;
	}

	public boolean addStudent(Student student) {
		if(studentDAO.findByStudentID(student.getStudentID())!=null){
			return false;
		}else{
			studentDAO.addStudent(student);
			return true;
		}	
	}

	public List<Student> findAllStudent() {
		return studentDAO.findAllStudent();
	}

	

	public boolean allowLogin(String studentID, String password) {

		Student student = studentDAO.findByStudentID(studentID);
		if (student == null) {// �ж��Ƿ���ڸ�ID��ѧ��
			return false;
		} else {
			if (password.equals(student.getPassword())) {// �ж������Ƿ���ͬ
				return true;
			} else {
				return false;
			}

		}
	}

	public Student getStudentInfo(String studentID) {
		return studentDAO.findByStudentID(studentID);
	}

	public void setStudentResult(String studentID, int result) {
		Student student = studentDAO.findByStudentID(studentID);// ����ID���ҵ���ѧ��
		student.setResult(result);// ������ɼ�
		studentDAO.updateStudent(student);// ����ѧ����Ϣ
	}

	public List<Student> getStudentByName(String studentName) {
		return studentDAO.findByStudentName(studentName);
	}

	public List<Student> getStudentByClass(String sclass) {
		return studentDAO.findByStudentClass(sclass);
	}

	public void update(Student student) {
		studentDAO.updateStudent(student);
		
	}
}
