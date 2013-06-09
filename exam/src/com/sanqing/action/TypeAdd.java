package com.sanqing.action;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Type;
import com.sanqing.service.TypeService;
import com.sanqing.service.TypeServiceImpl;

public class TypeAdd extends ActionSupport {
	private String typename;
	private String description;
	private TypeService typeService = new TypeServiceImpl();
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String execute() throws Exception {
		Type type = new Type();
		type.setName(typename);
		type.setDescription(description);
		if(typeService.addType(type)){
			return SUCCESS;
		}else {
			this.addActionError("该类型已经添加过了，请不要重复添加!");
			return INPUT;
		}
	}
}