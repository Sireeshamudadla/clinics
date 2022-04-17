package com.org.siri.repo;

import com.org.siri.model.Clinics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface ClinicRepo extends JpaRepository <Clinics,Integer>{

@Transactional
void deleteByClinicName(String clinicName);
}
