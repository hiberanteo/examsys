package com.sanqing.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Student;
import com.sanqing.service.StudentService;
import com.sanqing.service.StudentServiceImpl;

public class StudentManage extends ActionSupport {
	private StudentService studentService = new StudentServiceImpl();

	@Override
	public String execute() throws Exception {
		List<Student> students = studentService.findAllStudent();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("students", students);
		return SUCCESS;
	}
	
}
