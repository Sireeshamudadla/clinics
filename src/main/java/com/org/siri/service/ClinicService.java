package com.org.siri.service;

import com.org.siri.model.Clinics;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ClinicService {

    public void createClinic(Clinics clinics);
    public void updateClinics(Clinics clinics);
    public List<Clinics> getAllClinics();
    public String deleteByName(String clinicName);
}
