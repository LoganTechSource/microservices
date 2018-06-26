package com.logan.emiservice.model;

import java.util.Date;


public class EMIData {
	
	private Integer id;
	private Integer dueAmout;
	private Date dueDate;
	private Date paidDate;
	private String paidStatus;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDueAmout() {
		return dueAmout;
	}
	public void setDueAmout(Integer dueAmout) {
		this.dueAmout = dueAmout;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Date getPaidDate() {
		return paidDate;
	}
	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}
	public String getPaidStatus() {
		return paidStatus;
	}
	public void setPaidStatus(String paidStatus) {
		this.paidStatus = paidStatus;
	}

	
}
