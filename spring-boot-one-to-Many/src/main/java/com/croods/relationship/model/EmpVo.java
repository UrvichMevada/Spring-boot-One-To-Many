package com.croods.relationship.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="Emp")
public class EmpVo {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id" , length=10)
private Integer id;


@Column(name="name", length=25)
private String name;

@Column(name="address", length=25)
private String address;

@OneToMany( fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinColumn(name="emp_id")
List<Emp_SkiilVo> empskillvo;


public List<Emp_SkiilVo> getEmpskillvo() {
	return empskillvo;
}

public void setEmpskillvo(List<Emp_SkiilVo> empskillvo) {
	this.empskillvo = empskillvo;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

}
