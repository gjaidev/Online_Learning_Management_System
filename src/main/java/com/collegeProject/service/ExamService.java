package com.collegeProject.service;

import com.collegeProject.model.Exam;
import com.collegeProject.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {
    @Autowired
    private ExamRepository repository;

    public Exam saveExam(Exam exam){
       return repository.save(exam);
    }

    public List<Exam> saveExams(List<Exam> exams){
        return repository.saveAll(exams);
    }

    public List<Exam> getExams(){
        return repository.findAll();
    }

    public Exam getExamById(String exam_id){
        return repository.findById(exam_id).orElse(null);
    }

    public String deleteExam(String exam_id){
         repository.deleteById(exam_id);
        return "Exam deleted";
    }

    public Exam updateExam(Exam exam){
        Exam existingExam = repository.findById(String.valueOf(exam.getExam_no())).orElse(null);
        existingExam.setExam_date(exam.getExam_date());
        existingExam.setExam_name(exam.getExam_name());
        existingExam.setStudent_id(exam.getStudent_id());
        return repository.save(existingExam);
    }
}
