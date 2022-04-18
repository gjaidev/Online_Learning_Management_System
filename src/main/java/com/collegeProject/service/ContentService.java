package com.collegeProject.service;

import com.collegeProject.model.Content;
import com.collegeProject.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {
    @Autowired
    private ContentRepository repository;

    public Content saveContent(Content content){
       return repository.save(content);
    }

    public List<Content> saveContents(List<Content> contents){
        return repository.saveAll(contents);
    }

    public List<Content> getContents(){
        return repository.findAll();
    }

    public Content getContentById(String content_id){
        return repository.findById(content_id).orElse(null);
    }

    public String deleteContent(String content_id){
         repository.deleteById(content_id);
        return "Content deleted";
    }

    public Content updateContent(Content content){
        Content existingContent = repository.findById(String.valueOf(content.getContent_id())).orElse(null);
        existingContent.setContent_type(content.getContent_type());
        existingContent.setContent_description(content.getContent_description());
        return repository.save(existingContent);
    }
}
