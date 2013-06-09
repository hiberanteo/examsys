package com.sanqing.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class UserInterceptor extends AbstractInterceptor {

	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context =invocation.getInvocationContext();
		//���session
		Map session = context.getContext().getSession();
		String studentInfo = (String) session.get("studentInfo");
		String teacherInfo = (String) session.get("teacherInfo");
		//�ж��û��Ϸ���
		if(studentInfo == null || "".equals(studentInfo)
				||teacherInfo==null||"".equals(teacherInfo)) {
			//�����û���½ҳ��
			return Action.LOGIN;
		} else {
			//������һ��������û������
			return invocation.invoke();
		}
	}

}
