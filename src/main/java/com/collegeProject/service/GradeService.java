package com.collegeProject.service;

import com.collegeProject.model.Fees;
import com.collegeProject.model.Grade;
import com.collegeProject.repository.FeesRepository;
import com.collegeProject.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    private GradeRepository repository;

    public Grade saveGrade(Grade grade){
       return repository.save(grade);
    }

    public List<Grade> saveGrade(List<Grade> grades){
        return repository.saveAll(grades);
    }

    public List<Grade> getGrades(){
        return repository.findAll();
    }

    public Grade getGradesById(int grade_id){
        return repository.findById(grade_id).orElse(null);
    }

    public String deleteFees(int grade_id){
         repository.deleteById(grade_id);
        return "Feedback deleted";
    }

    public Grade updateFees(Grade grade){
        Grade existingGrade = repository.findById(grade.getGrade_id()).orElse(null);
        existingGrade.setGrade(grade.getGrade());
        existingGrade.setExam_no(grade.getExam_no());
        existingGrade.setMarks(grade.getMarks());
        return repository.save(existingGrade);
    }
}
