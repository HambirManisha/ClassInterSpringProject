package com.java.pojo;

public class College {
	private int cId;
	private String cName;
	Department dept;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public College(int cId, String cName, Department dept) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.dept = dept;
	}

	public College() {

	}

	@Override
	public String toString() {
		return "College [cId=" + cId + ", cName=" + cName + ", dept=" + dept + "]";
	}

}
