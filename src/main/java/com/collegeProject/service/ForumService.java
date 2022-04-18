package com.collegeProject.service;

import com.collegeProject.model.Forum;
import com.collegeProject.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumService {
    @Autowired
    private ForumRepository repository;

    public Forum saveForum(Forum forum){
       return repository.save(forum);
    }

    public List<Forum> saveForums(List<Forum> forums){
        return repository.saveAll(forums);
    }

    public List<Forum> getForum(){
        return repository.findAll();
    }

    public Forum getForumById(String forum_id){
        return repository.findById(forum_id).orElse(null);
    }

    public String deleteForum(String forum_id){
         repository.deleteById(forum_id);
        return "Forum deleted";
    }

//    public Forum updateForum(Forum forum){
//        Forum existingForum = repository.findById(String.valueOf(forum.getForum_id())).orElse(null);
//        existingForum.setForum_discussion(forum.getForum_discussion());
//        existingForum.setForum_post(forum.getForum_post());
//        existingForum.setStudent_posted(forum.getStudent_posted());
//        return repository.save(existingForum);
//    }
}
