package com.croods.relationship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croods.relationship.dao.EmpDao;
import com.croods.relationship.model.EmpVo;

@Service
public class EmpService {
	@Autowired
	EmpDao empDao;

	public Iterable<EmpVo> findAll() {
		return empDao.findAll();
	}

	public void save(EmpVo empVo) {
		empDao.save(empVo);
	}
	public void delete(int id)
	{EmpVo empVo=new EmpVo();
	empVo.setId(id);
		empDao.delete(empVo);
	}
}
