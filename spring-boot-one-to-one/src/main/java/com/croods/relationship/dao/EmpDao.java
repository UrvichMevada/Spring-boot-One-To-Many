package com.croods.relationship.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croods.relationship.model.EmpVo;
import com.croods.relationship.repository.EmpReposotroy;

@Service
public class EmpDao {
@Autowired
EmpReposotroy empReposotroy;
 public Iterable<EmpVo> findAll()
 {
	 return empReposotroy.findAll();
 }
public void save(EmpVo empVo) {
	// TODO Auto-generated method stub
	empReposotroy.save(empVo);
	
}
public void delete(EmpVo empVo) {
	// TODO Auto-generated method stub
	empReposotroy.delete(empVo);
	
}

}
