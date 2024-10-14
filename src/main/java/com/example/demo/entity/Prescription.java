package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prescription")
public class Prescription {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id;
	private String patientName;
	private String doctorName;
	private String injection;
	private String description;
	private double amount;
	private String status;
	public Prescription() {
		super();
	}
	public Prescription(long id, String patientName, String doctorName, String injection, String description,
			double amount, String status) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.injection = injection;
		this.description = description;
		this.amount = amount;
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getInjection() {
		return injection;
	}
	public void setInjection(String injection) {
		this.injection = injection;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientName=" + patientName + ", doctorName=" + doctorName + ", injection="
				+ injection + ", description=" + description + ", amount=" + amount + ", status=" + status + "]";
	}
	
	
	
	
}
