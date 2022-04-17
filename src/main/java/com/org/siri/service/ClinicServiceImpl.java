package com.org.siri.service;

import com.org.siri.model.Clinics;
import com.org.siri.repo.ClinicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicServiceImpl implements ClinicService {

    @Autowired
    ClinicRepo clinicRepo;

    @Override
    public void createClinic(Clinics clinics) {
        clinicRepo.save(clinics);

    }

    @Override
    public void updateClinics(Clinics clinics) {
        clinicRepo.save(clinics);

    }
    @Override
    public List<Clinics> getAllClinics() {
        List<Clinics> lis=clinicRepo.findAll();
        return lis;
    }

    @Override
    public String deleteByName(String clinicName) {
        clinicRepo.deleteByClinicName(clinicName);
        return "deleted success fully";
    }
}
