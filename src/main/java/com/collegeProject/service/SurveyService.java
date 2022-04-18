package com.collegeProject.service;

import com.collegeProject.model.Survey;
import com.collegeProject.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {
    @Autowired
    private SurveyRepository repository;

    public Survey saveSurvey(Survey survey){
       return repository.save(survey);
    }

    public List<Survey> saveSurvey(List<Survey> surveys){
        return repository.saveAll(surveys);
    }

    public List<Survey> getSurveys(){
        return repository.findAll();
    }

    public Survey getSurveyById(String survey_id){
        return repository.findById(survey_id).orElse(null);
    }

    public String deleteSurvey(String survey_id){
         repository.deleteById(survey_id);
        return "Survey deleted";
    }

//    public Survey updateSurvey(Survey survey){
//        Survey existingSupport= repository.findById(String.valueOf(survey.getSurvey_id())).orElse(null);
//        existingSupport.setSurvey_active(Boolean.TRUE);
//        existingSupport.setSurvey_edate(survey.getSurvey_edate());
//        existingSupport.setSurvey_sdate(survey.getSurvey_sdate());
//        existingSupport.setSurvey_topic(survey.getSurvey_topic());
//        return repository.save(existingSupport);
//    }
}
