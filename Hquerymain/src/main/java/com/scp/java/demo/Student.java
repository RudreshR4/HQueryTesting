package com.scp.java.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
	private int studID;
	private String studName;
	private long studMarks;
	
	public int getStudID() {
		return studID;
	}
	public void setStudID(int studID) {
		this.studID = studID;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public long getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(long studMarks) {
		this.studMarks = studMarks;
	}
	public Student(int studID, String studName, long studMarks) {
		super();
		this.studID = studID;
		this.studName = studName;
		this.studMarks = studMarks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\n [studID=" + studID + ", studName=" + studName + ", studMarks=" + studMarks + "]";
	}
	
}
