package com.sanqing.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Score;
import com.sanqing.po.Student;
import com.sanqing.service.ScoreService;
import com.sanqing.service.ScoreServiceImpl;
import com.sanqing.service.StudentService;
import com.sanqing.service.StudentServiceImpl;

public class QueryStudentByName extends ActionSupport{
	private String studentName;
	private StudentService studentService = new StudentServiceImpl();
	private ScoreService scoreService = new ScoreServiceImpl();
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Student> students = studentService.getStudentByName(studentName);//通过姓名查看成绩
		List<Score>scores = scoreService.findByStuId(students.get(0).getId());
		request.setAttribute("scores", scores);
		return this.SUCCESS;
	}
	
}
