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
    public void updateClinics(@RequestBody Clinics clinics){
        clinicService.updateClinics(clinics);
    }
    @GetMapping("/findAll")
    public List<Clinics> getAllClinics(){
        List<Clinics> li  =clinicService.getAllClinics();
        return li;
    }
    @DeleteMapping("/deleteByName/{clinicName}")
    public String deleteByName(@PathVariable String clinicName){
        String kgf   =clinicService.deleteByName(clinicName);
        return kgf;
    }
}
