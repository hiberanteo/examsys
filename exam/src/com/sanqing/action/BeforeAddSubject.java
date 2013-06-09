package com.sanqing.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Type;
import com.sanqing.service.TypeService;
import com.sanqing.service.TypeServiceImpl;

public class BeforeAddSubject extends ActionSupport {
	private TypeService typeService = new TypeServiceImpl();
	public String execute() throws Exception {
		List<Type> types = typeService.findAllType();//��������¼
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("types", types);
		return SUCCESS;
	}
}
