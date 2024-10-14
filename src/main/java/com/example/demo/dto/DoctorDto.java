package com.example.demo.dto;



public class DoctorDto {
	private long id;
	private String firstname;
	private String lastname;
	private String licenseNumber;
	private String email;
	private String password;
	private String speciliazation;
	private String location;
	private String description;
	private int experience;
	private String image;
	public DoctorDto() {
		super();
	}
	public DoctorDto(long id, String firstname, String lastname, String licenseNumber, String email, String password,
			String speciliazation, String location, String description, int experience, String image) {
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
	@Override
	public String toString() {
		return "DoctorDto [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", licenseNumber="
				+ licenseNumber + ", email=" + email + ", password=" + password + ", speciliazation=" + speciliazation
				+ ", location=" + location + ", description=" + description + ", experience=" + experience + ", image="
				+ image + "]";
	}
	
	

}
