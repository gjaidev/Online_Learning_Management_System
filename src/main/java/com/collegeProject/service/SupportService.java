package com.collegeProject.service;

import com.collegeProject.model.Support;
import com.collegeProject.repository.SupportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupportService {
    @Autowired
    private SupportRepository repository;

    public Support saveSupport(Support support){
       return repository.save(support);
    }

    public List<Support> saveSupports(List<Support> supports){
        return repository.saveAll(supports);
    }

    public List<Support> getSupports(){
        return repository.findAll();
    }

    public Support getSupportById(String support_id){
        return repository.findById(support_id).orElse(null);
    }

    public String deleteSupport(String support_id){
         repository.deleteById(support_id);
        return "Support deleted";
    }

    public Support updateSupport(Support support){
        Support existingSupport= repository.findById(String.valueOf(support.getSupport_id())).orElse(null);
        existingSupport.setSupport_name(support.getSupport_name());
        existingSupport.setSupport_division(support.getSupport_division());
        return repository.save(existingSupport);
    }
}
