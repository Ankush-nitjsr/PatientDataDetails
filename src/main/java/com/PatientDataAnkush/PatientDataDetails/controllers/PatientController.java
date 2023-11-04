package com.PatientDataAnkush.PatientDataDetails.controllers;

import com.PatientDataAnkush.PatientDataDetails.models.Patient;
import com.PatientDataAnkush.PatientDataDetails.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class PatientController {

    @Autowired
    private PatientService patientService;

    //starting CRUD operation

    //Create operation
    @PostMapping("/add-new-patient")
    public String create(@RequestBody Patient patient) {
        patientService.addNewPatient(patient);
        return "New Patient details added successfully";
    }

    //Read operation
    @GetMapping("/get-all-patient-details")
    public List<Patient> getAllPatientDetails() {
        return patientService.allPatientdetails();
    }

    @GetMapping("/get-patient-details-by-id")
    public Patient getPatientDetailsById(@RequestParam Integer id) {
        return patientService.allPatientdetailsByid(id);
    }


    //Update operation
    @PutMapping("/update")
    public String update(@RequestParam Integer id, @RequestBody Patient newPatient) {
        patientService.updatePatient(id, newPatient);
        return "Patient details updated successfully";
    }

    //Delete operation
    @DeleteMapping("/delete")
    public String deletePatient(@RequestParam Integer id) {
        return patientService.deletePatientById(id);
    }

    //to check the current logged-in user
    @GetMapping("/get-current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }
}
