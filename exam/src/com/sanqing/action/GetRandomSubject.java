package com.sanqing.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Subject;
import com.sanqing.po.Type;
import com.sanqing.service.SubjectService;
import com.sanqing.service.SubjectServiceImpl;
import com.sanqing.service.TypeService;
import com.sanqing.service.TypeServiceImpl;

/*
 * 获得随机试题
 */
public class GetRandomSubject extends ActionSupport{
	private int typeid;
	private SubjectService subjectService = new SubjectServiceImpl();
	private TypeService typeService = new TypeServiceImpl();
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Subject> subjects = subjectService.randomFindSubject(20,typeid);//获得试题记录
		Type type = typeService.findByTypeId(typeid);
		request.setAttribute("subjects", subjects);
		request.setAttribute("type", type);
		return SUCCESS;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
}
