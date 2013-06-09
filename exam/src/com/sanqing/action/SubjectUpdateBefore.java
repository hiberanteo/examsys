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
 * 获得更新试题前的试题
 */
public class SubjectUpdateBefore extends ActionSupport {
	private int subjectID;
	private SubjectService subjectService = new SubjectServiceImpl();
	private TypeService typeService = new TypeServiceImpl();
	public int getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	public String execute() throws Exception {
		Subject subject = subjectService.showSubjectParticular(subjectID);
		List<Type> types = typeService.findAllType();
		System.out.println(types.size());
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("subject", subject);
		request.setAttribute("types", types);
		return SUCCESS;
	}
}
