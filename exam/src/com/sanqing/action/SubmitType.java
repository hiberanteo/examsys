package com.sanqing.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Type;
import com.sanqing.service.TypeService;
import com.sanqing.service.TypeServiceImpl;

public class SubmitType extends ActionSupport {
	private int id;
	private String name;
	private TypeService typeService = new TypeServiceImpl();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String execute() throws Exception {
		Type type = new Type();
		type.setId(id);
		type.setName(name);
		Type type2 = typeService.findByTypeId(id);
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("type", type2);
		return this.SUCCESS;
	}
	
}
