package com.cap.automation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userTable")
public class User {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String projectName;
	@Column
	private String typeInterface;
	@Column
	private String description;
	@Column
	private String isrRitm;
	@Column
	private String comments;
	@Column
	private String uniqueNumber;

	public User() {
	}

	public User(int id, String projectName, String typeInterface, String description, String isrRitm, String comments,
			String uniqueNumber) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.typeInterface = typeInterface;
		this.description = description;
		this.isrRitm = isrRitm;
		this.comments = comments;
		this.uniqueNumber = uniqueNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTypeInterface() {
		return typeInterface;
	}

	public void setTypeInterface(String typeInterface) {
		this.typeInterface = typeInterface;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsrRitm() {
		return isrRitm;
	}

	public void setIsrRitm(String isrRitm) {
		this.isrRitm = isrRitm;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getUniqueNumber() {
		return uniqueNumber;
	}

	public void setUniqueNumber(String uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", projectName=" + projectName + ", typeInterface=" + typeInterface + ", description="
				+ description + ", isrRitm=" + isrRitm + ", comments=" + comments + "]";
	}

}
