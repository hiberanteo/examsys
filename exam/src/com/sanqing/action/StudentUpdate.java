package com.sanqing.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Student;
import com.sanqing.service.StudentService;
import com.sanqing.service.StudentServiceImpl;

public class StudentUpdate extends ActionSupport {
	private int id;
	private String studentID;
	private String password;
	private String studentName;
	private String sclass;
	private StudentService studentService = new StudentServiceImpl();
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
	@Override
	public String execute() throws Exception {
		Student student = new Student();
		student.setId(id);
		student.setStudentID(studentID);
		student.setStudentName(studentName);
		student.setPassword(password);
		student.setSclass(sclass);
		HttpServletRequest request = ServletActionContext.getRequest();
		studentService.update(student);
		request.setAttribute("student",student);
		this.addActionMessage("更新成功!");
		return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
