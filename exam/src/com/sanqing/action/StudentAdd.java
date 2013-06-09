package com.sanqing.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Student;
import com.sanqing.service.StudentService;
import com.sanqing.service.StudentServiceImpl;

public class StudentAdd extends ActionSupport {
	private String studentID;
	private String password;
	private String studentName;
	private String sclass;
	private StudentService studentService = new StudentServiceImpl();
	@Override
	public String execute() throws Exception {
		Student student = new Student();
		student.setStudentID(studentID);
		student.setPassword(password);
		student.setStudentName(studentName);
		student.setSclass(sclass);
		if(studentService.addStudent(student)){
			return SUCCESS;
		}else{
			this.addActionError("该学生学号重复，请不要重复添加!");
			return INPUT;
		}
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
}
