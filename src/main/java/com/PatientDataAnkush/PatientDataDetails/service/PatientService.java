package com.PatientDataAnkush.PatientDataDetails.service;

import com.PatientDataAnkush.PatientDataDetails.models.Patient;

import java.util.List;

public interface PatientService {
    void addNewPatient(Patient patient);

    void updatePatient(Integer id, Patient newPatient);

    List<Patient> allPatientdetails();

    Patient allPatientdetailsByid(Integer id);

    String deletePatientById(Integer id);
}
