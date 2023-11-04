package com.PatientDataAnkush.PatientDataDetails.service.impl;

import com.PatientDataAnkush.PatientDataDetails.models.Patient;
import com.PatientDataAnkush.PatientDataDetails.repository.PatientRepository;
import com.PatientDataAnkush.PatientDataDetails.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public void addNewPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void updatePatient(Integer id, Patient newPatient) {
        Patient existingPatientToBeUpdated = patientRepository.findById(id).get();
        existingPatientToBeUpdated.setName(newPatient.getName());
        existingPatientToBeUpdated.setAddress(newPatient.getAddress());
        existingPatientToBeUpdated.setContact_details(newPatient.getContact_details());
        existingPatientToBeUpdated.setPincode(newPatient.getPincode());
        patientRepository.save(existingPatientToBeUpdated);
    }

    @Override
    public List<Patient> allPatientdetails() {
        return patientRepository.findAll();
    }

    @Override
    public Patient allPatientdetailsByid(Integer id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public String deletePatientById(Integer id) {
        Patient patientToBeDeleted = patientRepository.findById(id).get();
        Patient deletedPatient = patientToBeDeleted;
        patientRepository.delete(patientToBeDeleted);
        return ("Patient deleted successfully having details: " + "\n" +
                "Name: " + deletedPatient.getName() + "\n" +
                "contact_details: " + deletedPatient.getContact_details() + "\n" +
                "address: " + deletedPatient.getAddress() + "\n" +
                "pincode: " + deletedPatient.getPincode());
    }
}
