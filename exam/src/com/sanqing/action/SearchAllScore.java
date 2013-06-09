package com.sanqing.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Score;
import com.sanqing.service.ScoreService;
import com.sanqing.service.ScoreServiceImpl;

public class SearchAllScore extends ActionSupport {
	private ScoreService scoreService = new ScoreServiceImpl();

	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Score> scores = scoreService.findAllScore();
		request.setAttribute("scores", scores);
		return SUCCESS;
	}
	
}
