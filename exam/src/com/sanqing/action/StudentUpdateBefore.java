package com.sanqing.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Student;
import com.sanqing.service.StudentService;
import com.sanqing.service.StudentServiceImpl;

public class StudentUpdateBefore extends ActionSupport {
	private String studentID;
	private StudentService studentService = new StudentServiceImpl();

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	@Override
	public String execute() throws Exception {
		Student student = studentService.findStudentById(studentID);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("student", student);
		return this.SUCCESS;
	}
}
