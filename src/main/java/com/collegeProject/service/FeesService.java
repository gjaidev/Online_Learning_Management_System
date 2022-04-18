package com.collegeProject.service;

import com.collegeProject.model.Fees;
import com.collegeProject.repository.FeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeesService {
    @Autowired
    private FeesRepository repository;

    public Fees saveFees(Fees fees){
       return repository.save(fees);
    }

    public List<Fees> saveFees(List<Fees> fees){
        return repository.saveAll(fees);
    }

    public List<Fees> getFees(){
        return repository.findAll();
    }

    public Fees getFeesById(int feedback_id){
        return repository.findById(feedback_id).orElse(null);
    }

    public String deleteFees(int feedback_id){
         repository.deleteById(feedback_id);
        return "Feedback deleted";
    }

    public Fees updateFees(Fees fees){
        Fees existingFees = repository.findById(fees.getFee_id()).orElse(null);
        existingFees.setAmount(fees.getAmount());
        existingFees.setFee_status(Boolean.TRUE);
        existingFees.setSemester_No(fees.getSemester_No());
        existingFees.setAmount(fees.getAmount());
        return repository.save(existingFees);
    }
}
