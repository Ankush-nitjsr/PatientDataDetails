package com.PatientDataAnkush.PatientDataDetails.repository;

import com.PatientDataAnkush.PatientDataDetails.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
