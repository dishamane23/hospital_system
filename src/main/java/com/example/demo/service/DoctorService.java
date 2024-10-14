package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.DoctorDto;
import com.example.demo.dto.DoctorLoginDto;
import com.example.demo.entity.Doctor;

public interface DoctorService {
	List<Doctor> getAllDoctors();

	Doctor getDoctorById(long id);

	Doctor addDoctor(Doctor doctor);

	Doctor updateDoctor(long id, Doctor updatedDoctor);

	void deleteDoctor(long id);
	Doctor loginDoctor(String email, String password);

	Doctor registerDoctor(DoctorDto doctorDto);
	Doctor loginDoctor(DoctorLoginDto credentials);
}
