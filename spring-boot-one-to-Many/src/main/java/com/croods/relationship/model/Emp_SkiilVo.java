package com.croods.relationship.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Skill")
public class Emp_SkiilVo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="skillid" , length=10)
	private Integer skillid;

	@Column(name="skillname", length=25)
	private String skillname;

	public int getSkillid() {
		return skillid;
	}

	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}

	public String getSkillname() {
		return skillname;
	}

	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}

}
