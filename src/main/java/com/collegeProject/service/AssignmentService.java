package com.collegeProject.service;

import com.collegeProject.model.Assignment;
import com.collegeProject.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepository repository;

    public Assignment saveAssignment(Assignment assignment){
       return repository.save(assignment);
    }

    public List<Assignment> saveAssignments(List<Assignment> assignments){
        return repository.saveAll(assignments);
    }

    public List<Assignment> getAssignments(){
        return repository.findAll();
    }

    public Assignment getAssignmentById(String assignment_id){
        return repository.findById(assignment_id).orElse(null);
    }

    public String deleteAssignment(String admin_id){
         repository.deleteById(admin_id);
        return "Course deleted";
    }

    public Assignment updateAssignment(Assignment assignment){
        Assignment existingAssignment = repository.findById(String.valueOf(assignment.getAssignment_id())).orElse(null);
        existingAssignment.setDue_date(assignment.getDue_date());
        existingAssignment.setStart_date(assignment.getStart_date());
        existingAssignment.setAssignment_title(assignment.getAssignment_title());
        existingAssignment.setStudent_id(assignment.getStudent_id());
        return repository.save(existingAssignment);
    }
}
