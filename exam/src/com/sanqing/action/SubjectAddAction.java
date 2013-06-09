package com.sanqing.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Subject;
import com.sanqing.po.Type;
import com.sanqing.service.SubjectService;
import com.sanqing.service.SubjectServiceImpl;
import com.sanqing.service.TypeService;
import com.sanqing.service.TypeServiceImpl;

//该Action用来接收试题参数，并调用业务逻辑组件SubjectService来完成试题添加
public class SubjectAddAction extends ActionSupport{
	private String subjectTitle;
	private String subjectOptionA;
	private String subjectOptionB;
	private String subjectOptionC;
	private String subjectOptionD;
	private String subjectAnswer;
	private String subjectParse;
	private int subjectType;
	private SubjectService subjectService = new SubjectServiceImpl();
	private TypeService typeService = new TypeServiceImpl();
	public String getSubjectTitle() {
		return subjectTitle;
	}
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}
	public String getSubjectOptionA() {
		return subjectOptionA;
	}
	public void setSubjectOptionA(String subjectOptionA) {
		this.subjectOptionA = subjectOptionA;
	}
	public String getSubjectOptionB() {
		return subjectOptionB;
	}
	public void setSubjectOptionB(String subjectOptionB) {
		this.subjectOptionB = subjectOptionB;
	}
	public String getSubjectOptionC() {
		return subjectOptionC;
	}
	public void setSubjectOptionC(String subjectOptionC) {
		this.subjectOptionC = subjectOptionC;
	}
	public String getSubjectOptionD() {
		return subjectOptionD;
	}
	public void setSubjectOptionD(String subjectOptionD) {
		this.subjectOptionD = subjectOptionD;
	}
	public String getSubjectAnswer() {
		return subjectAnswer;
	}
	public void setSubjectAnswer(String subjectAnswer) {
		this.subjectAnswer = subjectAnswer;
	}
	public String getSubjectParse() {
		return subjectParse;
	}
	public void setSubjectParse(String subjectParse) {
		this.subjectParse = subjectParse;
	}
	public int getSubjectType() {
		return subjectType;
	}
	public void setSubjectType(int subjectType) {
		this.subjectType = subjectType;
	}
	public String execute() throws Exception {
		//HttpServletRequest request = ServletActionContext.getRequest();
		Subject subject = new Subject();
		subject.setSubjectTitle(subjectTitle);
		subject.setSubjectOptionA(subjectOptionA);
		subject.setSubjectOptionB(subjectOptionB);
		subject.setSubjectOptionC(subjectOptionC);
		subject.setSubjectOptionD(subjectOptionD);
		subject.setSubjectAnswer(subjectAnswer);
		subject.setSubjectParse(subjectParse);
		subject.setSubjectType(subjectType);
		//request.getParameter("subjectType");
		Type type = typeService.findByTypeId(subjectType);
		String typeName = type.getName();
		subject.setTypeName(typeName);
		if(subjectService.saveSubject(subject)) {
			return SUCCESS;
		}else {
			this.addActionError("该试题已经添加过了，请不要重复添加!");
			return INPUT;
		}
	}

	
}
