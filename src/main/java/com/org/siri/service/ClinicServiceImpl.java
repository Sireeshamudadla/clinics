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

    @Override
    public List<Clinics> findByClinicCity(String clinicCity) {
        List<Clinics> cli= clinicRepo.findByClinicCity(clinicCity);
        return cli;
    }

    /*who all are staying in bangalore we need to expenditure double and save in to db
     *
     * */
    @Override
    public String expenditureDouble(String clinicCity) {

        /*start business logic
        * */

        List<Clinics> cityList= clinicRepo.findByClinicCity(clinicCity);

        for (int i=0;i<cityList.size();i++){
            Clinics clinics   =cityList.get(i);

            if(clinics.getClinicCity().equals("blr")){
                clinics.setClinicExp(clinics.getClinicExp()*2);
            }

            clinicRepo.save(clinics);
        }

        return "success fully updated expenditure";
    }
}
