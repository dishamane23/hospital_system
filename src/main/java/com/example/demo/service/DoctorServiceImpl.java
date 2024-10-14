package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DoctorDto;
import com.example.demo.dto.DoctorLoginDto;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.User;
import com.example.demo.repository.DoctorRepo;
@Service
public class DoctorServiceImpl implements  DoctorService {

@Autowired
private final DoctorRepo doctorRepo;

   
@Override
public List<Doctor> getAllDoctors() {
	  return doctorRepo.findAll();
}
public DoctorServiceImpl(DoctorRepo doctorRepo) {
	super();
	this.doctorRepo = doctorRepo;
}
@Override
public Doctor getDoctorById(long id) {
	 Optional<Doctor> optionalDoctor = doctorRepo.findById(id);
       return optionalDoctor.orElse(null);
	
}
@Override
public Doctor addDoctor(Doctor doctor) {
	
	  return doctorRepo.save(doctor);
}
@Override
public Doctor updateDoctor(long id, Doctor updatedDoctor) {
	 return doctorRepo.findById(id)
               .map(doctor -> {
            	   doctor.setFirstname(updatedDoctor.getFirstname());
                   
                   doctor.setLastname(updatedDoctor.getLastname());
                   doctor.setLicenseNumber(updatedDoctor.getLicenseNumber());
                   doctor.setEmail(updatedDoctor.getEmail());
                   doctor.setPassword(updatedDoctor.getPassword());
                   doctor.setSpeciliazation(updatedDoctor.getSpeciliazation());
                   doctor.setLocation(updatedDoctor.getLocation());
                   doctor.setDescription(updatedDoctor.getDescription());
                   doctor.setExperience(updatedDoctor.getExperience());
                   doctor.setImage(updatedDoctor.getImage());
                   return doctorRepo.save(doctor);}).orElse(null);
}
@Override
public void deleteDoctor(long id) {
	doctorRepo.deleteById(id);
}
@Override
public Doctor loginDoctor(String email, String password) {
	Doctor doctor = doctorRepo.findByEmail(email);
    
    if (doctor != null && doctor.getPassword().equals(password)) {
        return doctor; // Successful login
    }
    
    return null;
}
@Override
public Doctor registerDoctor(DoctorDto doctorDto) {
	Doctor doctor = new Doctor();
	doctor.setFirstname(doctorDto.getFirstname());
	doctor.setLastname(doctorDto.getLastname());
	doctor.setLicenseNumber(doctorDto.getLicenseNumber());
	doctor.setEmail(doctorDto.getEmail());
	doctor.setPassword(doctorDto.getPassword());
	doctor.setSpeciliazation(doctorDto.getSpeciliazation());
	doctor.setLocation(doctorDto.getLocation());
	doctor.setDescription(doctorDto.getDescription());
	doctor.setExperience(doctorDto.getExperience());
	doctor.setImage(doctorDto.getImage());
    
    // Save the user to the database
    return doctorRepo.save(doctor);
}
@Override
public Doctor loginDoctor(DoctorLoginDto credentials) {
	return loginDoctor(credentials.getEmail(), credentials.getPassword());
}
}




