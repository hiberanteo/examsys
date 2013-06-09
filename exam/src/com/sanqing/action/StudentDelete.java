package com.sanqing.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.service.StudentService;
import com.sanqing.service.StudentServiceImpl;

public class StudentDelete extends ActionSupport {
	private int id;
	private StudentService studentService = new StudentServiceImpl();
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String execute() throws Exception {
		studentService.deleteStudentById(id);
		return this.SUCCESS;
	}
	
}
