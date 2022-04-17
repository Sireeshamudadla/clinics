package com.org.siri.controller;

import com.org.siri.model.Clinics;
import com.org.siri.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClinicController {

    @Autowired
    ClinicService clinicService;

    @PostMapping("/create")
    public void createClinic(@RequestBody Clinics clinics) {
        clinicService.createClinic(clinics);
    }

    @PutMapping("/update")
    public void updateClinics(@RequestBody Clinics clinics) {
        clinicService.updateClinics(clinics);
    }

    @GetMapping("/findAll")
    public List<Clinics> getAllClinics() {
        List<Clinics> li = clinicService.getAllClinics();
        return li;
    }

    @DeleteMapping("/deleteByName/{clinicName}")
    public String deleteByName(@PathVariable String clinicName) {
        String kgf = clinicService.deleteByName(clinicName);
        return kgf;
    }

    @GetMapping("/findByCity/{clinicCity}")
    public List<Clinics> findByClinicCity(@PathVariable String clinicCity) {
        List<Clinics> sir = clinicService.findByClinicCity(clinicCity);
        return sir;
    }

    /*who all are staying in bangalore we need to expenditure double and save in to db
     *
     * */


    @PostMapping("/expenditureDouble/{clinicCity}")
    public String expenditureDouble(@PathVariable String clinicCity) {
        String s = clinicService.expenditureDouble(clinicCity);
        return s;
    }


}
