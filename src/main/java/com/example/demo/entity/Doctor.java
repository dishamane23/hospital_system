package com.example.demo.entity;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
private long id;
@Column(nullable=false)
private String firstname;
@Column(nullable=false)
private String lastname;
@Column(nullable=false,unique=true)
private String licenseNumber;
@Column
private String email;
@Column
private String password;
@Column
private String speciliazation;
@Column
private String location;
@Column
private String description;
@Column
private int experience;
@Column
private String image;
@ManyToOne
@JoinColumn(name = "admin_id")
private Admin admin;

// One-to-many relationship with Appointments
@OneToMany(mappedBy = "doctor")
private List<Appointments> appointments;

public Doctor() {
	super();
}

public Doctor(long id, String firstname, String lastname, String licenseNumber, String email, String password,
		String speciliazation, String location, String description, int experience, String image, Admin admin,
		List<Appointments> appointments) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.licenseNumber = licenseNumber;
	this.email = email;
	this.password = password;
	this.speciliazation = speciliazation;
	this.location = location;
	this.description = description;
	this.experience = experience;
	this.image = image;
	this.admin = admin;
	this.appointments = appointments;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getLicenseNumber() {
	return licenseNumber;
}

public void setLicenseNumber(String licenseNumber) {
	this.licenseNumber = licenseNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getSpeciliazation() {
	return speciliazation;
}

public void setSpeciliazation(String speciliazation) {
	this.speciliazation = speciliazation;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getExperience() {
	return experience;
}

public void setExperience(int experience) {
	this.experience = experience;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public Admin getAdmin() {
	return admin;
}

public void setAdmin(Admin admin) {
	this.admin = admin;
}

public List<Appointments> getAppointments() {
	return appointments;
}

public void setAppointments(List<Appointments> appointments) {
	this.appointments = appointments;
}

@Override
public String toString() {
	return "Doctor [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", licenseNumber="
			+ licenseNumber + ", email=" + email + ", password=" + password + ", speciliazation=" + speciliazation
			+ ", location=" + location + ", description=" + description + ", experience=" + experience + ", image="
			+ image + ", admin=" + admin + ", appointments=" + appointments + "]";
}






}