package com.collegeProject.service;

import com.collegeProject.model.Workshop;
import com.collegeProject.repository.WorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkShopService {
    @Autowired
    private WorkshopRepository repository;

    public Workshop saveWorkshop(Workshop workshop){
       return repository.save(workshop);
    }

    public List<Workshop> saveWorkshop(List<Workshop> workshops){
        return repository.saveAll(workshops);
    }

    public List<Workshop> getWorkshops(){
        return repository.findAll();
    }

    public Workshop getWorkshopById(String workshop_id){
        return repository.findById(workshop_id).orElse(null);
    }

    public String deleteWorkshop(String workshop_id){
         repository.deleteById(workshop_id);
        return "WorkShop deleted";
    }

//    public Workshop updateWorkshop(Workshop workshop){
//        Workshop existingWorkShop= repository.findById(String.valueOf(workshop.getWorkshop_number())).orElse(null);
//        existingWorkShop.setWorkshop_date(workshop.getWorkshop_date());
//        existingWorkShop.setWorkshop_name(workshop.getWorkshop_name());
//        existingWorkShop.setWorkshop_subject(workshop.getWorkshop_subject());
//        return repository.save(existingWorkShop);
//    }
}
