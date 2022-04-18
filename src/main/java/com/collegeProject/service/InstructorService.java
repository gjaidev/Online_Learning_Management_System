package com.collegeProject.service;

import com.collegeProject.model.*;
import com.collegeProject.repository.DepartmentRepository;
import com.collegeProject.repository.InstructorRepository;
import com.collegeProject.repository.SurveyRepository;
import com.collegeProject.repository.WorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstructorService {
    @Autowired
    private InstructorRepository repository;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private SurveyRepository surveyRepository;
    @Autowired
    private WorkshopRepository workshopRepository;

    public Instructor saveInstructor(Instructor instructor){
       return repository.save(instructor);
    }

    public List<Instructor> saveInstructors(List<Instructor> instructors){
        return repository.saveAll(instructors);
    }

    public List<Instructor> getInstructors(){
        return repository.findAll();
    }

    public Instructor getInstructorById(int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteInstructor(int id){
         repository.deleteById(id);
        return "Instructor deleted";
    }

    public InstructorDetails getInstructorDetails(int instructor_id){
        Instructor existingInstructor = repository.findById(instructor_id).orElse(null);
        List<Department> departments = departmentRepository.findAll();
        List<Survey> surveys = surveyRepository.findAll();
        List<Workshop> workshops = workshopRepository.findAll();
        List<Department> reqDepts = new ArrayList<>();
        List<Survey> reqSurveys = new ArrayList<>();
        List<Workshop> reqWorkshops = new ArrayList<>();
        InstructorDetails instructorDetails = new InstructorDetails();
        for(int i=0;i<departments.size();i++){
            if(departments.get(i).getInstructor_id()==instructor_id){
                reqDepts.add(departments.get(i));
            }
        }
        for(int i=0;i<surveys.size();i++){
            if(surveys.get(i).getInstructor_id()==instructor_id){
                reqSurveys.add(surveys.get(i));
            }
        }
        for(int i=0;i<workshops.size();i++){
            if(workshops.get(i).getInstructor_id()==instructor_id){
                reqWorkshops.add(workshops.get(i));
            }
        }
        instructorDetails.setInstructor_id(instructor_id);
        instructorDetails.setInstructor_email(existingInstructor.getInstructor_email());
        instructorDetails.setInstructor_phone_number(existingInstructor.getInstructor_phone_number());
        instructorDetails.setInstuctor_name(existingInstructor.getInstuctor_name());
        instructorDetails.setInstructor_experience(existingInstructor.getInstructor_experience());
        instructorDetails.setCourse_id(existingInstructor.getCourse_id());
        instructorDetails.setDepartments(reqDepts);
        instructorDetails.setSurveys(reqSurveys);
        instructorDetails.setWorkshops(reqWorkshops);
        return instructorDetails;
    }

//    public Instructor updateInstructor(Instructor instructor){
//        Instructor existingInstructor = repository.findById(instructor.getInstructor_id()).orElse(null);
//        existingInstructor.setInstructor_email(instructor.getInstructor_email());
//        existingInstructor.setInstuctor_name(instructor.getInstuctor_name());
//        existingInstructor.setInstructor_Experience(instructor.getInstructor_Experience());
//        existingInstructor.setCourse_id(instructor.getCourse_id());
//        existingInstructor.setInstructor_phone_number(instructor.getInstructor_phone_number());
//        return repository.save(existingInstructor);
//    }
}