package com.logan.repo.emirepo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="emi")
@SequenceGenerator(name="emiseq", initialValue=1, allocationSize=100)
public class EMIData {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="emiseq")
	private Integer id;
	
	@Column(name="due_amount")
	private Integer dueAmout;
	
	@Column(name="due_date")
	@Temporal(TemporalType.DATE)
	private Date dueDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="paid_date")
	private Date paidDate;
	
	@Column(name="paid_status")
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
	
	@Override
	public String toString() {
		return "EMIData [id=" + id + ", dueAmout=" + dueAmout + ", dueDate=" + dueDate + ", paidDate=" + paidDate
				+ ", paidStatus=" + paidStatus + "]";
	}
}
