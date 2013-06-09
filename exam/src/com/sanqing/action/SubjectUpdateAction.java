package com.sanqing.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Subject;
import com.sanqing.service.SubjectService;
import com.sanqing.service.SubjectServiceImpl;
import com.sanqing.service.TypeService;
import com.sanqing.service.TypeServiceImpl;

public class SubjectUpdateAction extends ActionSupport{
	private int subjectID;
	private String subjectTitle;
	private String subjectOptionA;
	private String subjectOptionB;
	private String subjectOptionC;
	private String subjectOptionD;
	private String subjectAnswer;
	private String subjectParse;
	private int typeid;
	private SubjectService subjectService = new SubjectServiceImpl();
	private TypeService typeService = new TypeServiceImpl();
	
	public int getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
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
	public String execute() throws Exception {
		Subject subject = new Subject();
		subject.setSubjectID(subjectID);
		subject.setSubjectTitle(subjectTitle);
		subject.setSubjectOptionA(subjectOptionA);
		subject.setSubjectOptionB(subjectOptionB);
		subject.setSubjectOptionC(subjectOptionC);
		subject.setSubjectOptionD(subjectOptionD);
		subject.setSubjectAnswer(subjectAnswer);
		subject.setSubjectParse(subjectParse);
		subject.setSubjectType(typeid);
		String typeName = typeService.findByTypeId(typeid).getName();
		subject.setTypeName(typeName);
		//subject.setSubjectType(subjectType);
		subjectService.updateSubject(subject);//更新
		ServletActionContext.getRequest().setAttribute("subject", subject);
		this.addActionMessage("更新成功!");
		return SUCCESS;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

}
