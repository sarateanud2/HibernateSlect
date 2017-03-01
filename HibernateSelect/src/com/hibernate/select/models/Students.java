package com.hibernate.select.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentTab")
public class Students{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String secondName;
	@Column
	private int age;
	@Column
	private int year;
	
	public Students() {
		super();
	}
	
	

	public Students(String name, String secondName, int age, int year) {
		super();
		this.name = name;
		this.secondName = secondName;
		this.age = age;
		this.year = year;
	}



	public Students(int id, String name, String secondName, int age, int year) {
		super();
		this.id = id;
		this.name = name;
		this.secondName = secondName;
		this.age = age;
		this.year = year;
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

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
	


