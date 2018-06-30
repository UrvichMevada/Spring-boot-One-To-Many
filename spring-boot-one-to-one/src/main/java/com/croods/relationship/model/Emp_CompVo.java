package com.croods.relationship.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Emp_comp")
public class Emp_CompVo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id" , length=10)
	private int emp_id;
	
	@Column(name="compname", length=25)
	private String compname;
	

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}
	

}
