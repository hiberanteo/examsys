package com.sanqing.dao;

import java.util.List;

import com.sanqing.po.Type;

public interface TypeDAO {
	public Type findByTypeId(int id);
	
	public Type findByTypeName(String name);

	public List<Type> findAllType();

	public void updateType(Type type);

	public void addType(Type type);
}
