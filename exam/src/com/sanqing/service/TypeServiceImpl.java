package com.sanqing.service;

import java.util.List;

import com.sanqing.dao.TypeDAO;
import com.sanqing.dao.TypeDAOImpl;
import com.sanqing.po.Type;

public class TypeServiceImpl implements TypeService {
	public boolean addType(Type type) {
		if(typeDAO.findByTypeName(type.getName())!=null){
			return false;
		}else{
			typeDAO.addType(type);
			return true;
		}
	}

	private TypeDAO typeDAO = new TypeDAOImpl();
	public List<Type> findAllType() {
		return typeDAO.findAllType();
	}

	public Type findByTypeId(int id) {
		return typeDAO.findByTypeId(id);
	}

	public void updateType(Type type) {
		typeDAO.updateType(type);

	}

}
