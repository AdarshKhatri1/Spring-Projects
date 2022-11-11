package com.masai.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private int deptid;
	private String dname;
	private String location;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employee> emps = new ArrayList<>();

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", dname=" + dname + ", location=" + location + "]";
	}

	public Department(int deptid, String dname, String location) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.location = location;
	}
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
}
