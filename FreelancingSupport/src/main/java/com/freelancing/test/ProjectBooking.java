package com.freelancing.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjectBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	private String projectName;
	private String projectOwner;
	private int projectSprint;
	private double projectSprintPrice;

	public ProjectBooking(){}
	public ProjectBooking(String projectName, String projectOwner, int projectSprint, double projectSprintPrice) {
		super();
		this.projectName = projectName;
		this.projectOwner = projectOwner;
		this.projectSprint = projectSprint;
		this.projectSprintPrice = projectSprintPrice;
	}
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectOwner() {
		return projectOwner;
	}

	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}

	public int getProjectSprint() {
		return projectSprint;
	}

	public void setProjectSprint(int projectSprint) {
		this.projectSprint = projectSprint;
	}

	public double getProjectSprintPrice() {
		return projectSprintPrice;
	}

	public void setProjectSprintPrice(double projectSprintPrice) {
		this.projectSprintPrice = projectSprintPrice;
	}

	public double getTotalPrice() {
		return projectSprint * projectSprintPrice;
	}
}
