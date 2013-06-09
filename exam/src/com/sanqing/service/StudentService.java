package com.sanqing.service;

import java.util.List;

import com.sanqing.po.Student;

public interface StudentService {
	// 判断是否为合法学生，从而决定是否允许登录
	public boolean allowLogin(String studentID, String password);

	// 获得学生信息
	public Student getStudentInfo(String studentID);

	// 设置学生成绩
	public void setStudentResult(String studentID, int result);

	// 根据学生姓名查找学生
	public List<Student> getStudentByName(String studentName);

	// 根据班级查找学生
	public List<Student> getStudentByClass(String sclass);

	// 查找所有学生信息
	public List<Student> findAllStudent();

	// 增加学生信息
	public boolean addStudent(Student student);

	// 通过学号查找学生
	public Student findStudentById(String studentId);
	//更新学生信息
	public void update(Student student);
	//删除学生，id
	public void deleteStudentById(int id);
}
