package com.sanqing.service;

import com.sanqing.po.Teacher;

public interface TeacherService {
	//�ж��Ƿ�Ϊ�Ϸ���ʦ���Ӷ������Ƿ������¼
	public boolean allowLogin(String teacherID,String password);
	public Teacher findByTeacherID(String teacherID);
}
