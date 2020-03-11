package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User
{   @Id
	@GeneratedValue
	int id;
	String name;
	String mailid;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, String mailid) {
		super();
		this.name = name;
		this.mailid = mailid;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mailid=" + mailid + "]";
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
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	
}