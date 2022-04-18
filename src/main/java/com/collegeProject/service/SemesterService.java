package com.collegeProject.service;

import com.collegeProject.model.Semester;
import com.collegeProject.repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemesterService {
    @Autowired
    private SemesterRepository repository;

    public Semester saveSemester(Semester semester){
       return repository.save(semester);
    }

    public List<Semester> saveSemesters(List<Semester> semesters){
        return repository.saveAll(semesters);
    }

    public List<Semester> getSemester(){
        return repository.findAll();
    }

    public Semester getSemesterById(int semester_id){
        return repository.findById(semester_id).orElse(null);
    }

    public String deleteSemester(int semester_id){
         repository.deleteById(semester_id);
        return "Semester deleted";
    }

    public Semester updateSemester(Semester semester){
        Semester existingSemester = repository.findById(semester.getSemester_no()).orElse(null);
        existingSemester.setSemester_name(semester.getSemester_name());
        return repository.save(existingSemester);
    }
}
