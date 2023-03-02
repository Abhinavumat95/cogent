package com.cogent.Batch65_SpringBoottwo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table 
public class Performer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String project;
	String descAchievement;
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
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getDescAchievement() {
		return descAchievement;
	}
	public void setDescAchievement(String descAchievement) {
		this.descAchievement = descAchievement;
	}
	public Performer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Performer(int id, String name, String project, String descAchievement) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
		this.descAchievement = descAchievement;
	}
	@Override
	public String toString() {
		return "Performer [id=" + id + ", name=" + name + ", project=" + project + ", descAchievement="
				+ descAchievement + "]";
	}
	

}
