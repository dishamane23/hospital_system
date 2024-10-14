package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Prescription;
@Repository
public interface PrescriptionRepo extends JpaRepository<Prescription,Long>{

}
