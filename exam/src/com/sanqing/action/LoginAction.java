package com.sanqing.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sanqing.po.Student;
import com.sanqing.po.Teacher;
import com.sanqing.service.StudentService;
import com.sanqing.service.StudentServiceImpl;
import com.sanqing.service.TeacherService;
import com.sanqing.service.TeacherServiceImpl;

public class LoginAction extends ActionSupport {
	private String id; 			// �����û����
	private String password;	// �����û�����
	private String role;		// �����û���ɫ
	private StudentService studentService = 
		new StudentServiceImpl();//ѧ��ҵ���߼��������
	private TeacherService teacherService = 
		new TeacherServiceImpl();//��ʦҵ���߼��������

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		if("student".equals(role)) {//�����ѧ����ݵ�¼
			if(studentService.allowLogin(id, password)) {
				Student studentInfo = studentService.getStudentInfo(id);
				//����ѧ����¼��session��Χ
				
				session.put("studentInfo", studentInfo);
				return "studentSuccess";
			}else {
				addActionError("��ѧ����Ų����ڣ��������벻��ȷ!");
				return this.INPUT;
			}
		}else {
			if(teacherService.allowLogin(id, password)) {
				Teacher teacherInfo = teacherService.findByTeacherID(id);
				session.put("teacherInfo",teacherInfo);
				return "teacherSuccess";
			}else {
				addActionError("�ý�ʦ��Ų����ڣ��������벻��ȷ!");
				return this.INPUT;
			}
		}
	}
}
