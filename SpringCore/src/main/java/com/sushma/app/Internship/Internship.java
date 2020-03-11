
package com.sushma.app.Internship;

public class Internship {
	int id;
	String name;
	String college;
	float percentage;
	String department;

	boolean selected;
	String mentor;

	public Internship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Internship(String name, String college, float percentage, String department) {
		super();
		this.name = name;
		this.college = college;
		this.percentage = percentage;
		this.department = department;
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

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	@Override
	public String toString() {
		return "Internship [id=" + id + ", name=" + name + ", college=" + college + ", percentage=" + percentage
				+ ", department=" + department + ", selected=" + selected + ", mentor=" + mentor + "]";
	}

}
