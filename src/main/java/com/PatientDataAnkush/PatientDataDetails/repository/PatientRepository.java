package com.PatientDataAnkush.PatientDataDetails.repository;

import com.PatientDataAnkush.PatientDataDetails.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
