package com.department;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {

	@Id
	int deptid;
	String deptname;

	// getter and setter
	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	// toString
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + "]";
	}

	// parameterized constructor
	public Department(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}

	// no argument
	public Department() {

	}

}
