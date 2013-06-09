package com.sanqing.service;

import java.util.List;

import com.sanqing.po.Type;

public interface TypeService {
	public Type findByTypeId(int id);

	public List<Type> findAllType();

	public void updateType(Type type);

	public boolean addType(Type type);
}
