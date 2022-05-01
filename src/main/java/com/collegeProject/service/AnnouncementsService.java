package com.collegeProject.service;

import com.collegeProject.model.Announcements;
import com.collegeProject.repository.AnnouncementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnnouncementsService {
    @Autowired
    private AnnouncementsRepository repository;


    public List<Announcements> saveAnnouncements(List<Announcements> announcements){
        return repository.saveAll(announcements);
    }
    public Announcements saveAnnouncement(Announcements announcements){
        return repository.save(announcements);
    }

    public List<Announcements> getAllAnnouncements(){
        return repository.findAll();
    }
}
