package com.collegeProject.service;

import com.collegeProject.model.Feedback;
import com.collegeProject.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository repository;

    public Feedback saveFeedback(Feedback feedback){
       return repository.save(feedback);
    }

    public List<Feedback> saveFeedbacks(List<Feedback> feedbacks){
        return repository.saveAll(feedbacks);
    }

    public List<Feedback> getFeedbacks(){
        return repository.findAll();
    }

    public Feedback getFeedbackById(int feedback_id){
        return repository.findById(feedback_id).orElse(null);
    }

    public String deleteFeedback(int feedback_id){
         repository.deleteById(feedback_id);
        return "Feedback deleted";
    }

    public Feedback updateFeedback(Feedback feedback){
        Feedback existingFeedback = repository.findById(feedback.getFeedback_id()).orElse(null);
        existingFeedback.setFeedback_text(feedback.getFeedback_text());
        existingFeedback.setFeedback_course_id(feedback.getFeedback_course_id());
        existingFeedback.setStudent_id(feedback.getStudent_id());
        return repository.save(existingFeedback);
    }
}
