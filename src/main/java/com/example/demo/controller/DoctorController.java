package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.DoctorDto;
import com.example.demo.dto.DoctorLoginDto;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserLoginDto;
import com.example.demo.entity.Doctor;
import com.example.demo.entity.User;
import com.example.demo.repository.DoctorRepo;
import com.example.demo.service.DoctorService;


@RestController
@CrossOrigin("*")
@RequestMapping("/doctors")
public class DoctorController{
	@Autowired
    private final DoctorRepo doctorRepo;
	private DoctorService doctorService;

   
   

    public DoctorController(DoctorRepo doctorRepo, DoctorService doctorService) {
		super();
		this.doctorRepo = doctorRepo;
		this.doctorService = doctorService;
	}

	@GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }

    @GetMapping("{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        return doctorRepo.findById(id).orElse(null);
    }

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    @PutMapping("{id}")
    public Doctor updateDoctor(@PathVariable Long id, @RequestBody Doctor updatedDoctor) {
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
                    return doctorRepo.save(doctor);
                })
                .orElse(null);
    }

    @DeleteMapping("{id}")
    public void deleteDoctor(@PathVariable Long id) {
        doctorRepo.deleteById(id);
    }
    @PostMapping("/register")
    public ResponseEntity<Doctor> registerDoctor(@RequestBody DoctorDto doctorDto) {
    	Doctor registeredDoctor = doctorService.registerDoctor(doctorDto);
        return new ResponseEntity<>(registeredDoctor, HttpStatus.CREATED);
    }
    @PostMapping("/login")
    public ResponseEntity<Doctor> loginDoctor(@RequestBody DoctorLoginDto credentials) {
        String email = credentials.getEmail();
        String password = credentials.getPassword();

        Doctor loggedInDoctor = doctorService.loginDoctor(email, password);

        if (loggedInDoctor != null) {
            return ResponseEntity.ok(loggedInDoctor);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}
