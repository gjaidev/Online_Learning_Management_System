package com.collegeProject.service;

import com.collegeProject.model.Course;
import com.collegeProject.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository repository;

    public Course saveCourse(Course course){
       return repository.save(course);
    }

    public List<Course> saveCourses(List<Course> courses){
        return repository.saveAll(courses);
    }

    public List<Course> getCourses(){
        return repository.findAll();
    }

    public Course getCourseById(int course_id){
        return repository.findById(course_id).orElse(null);
    }

    public String deleteCourse(int course_id){
         repository.deleteById(course_id);
        return "Course deleted";
    }

    public Course updateCourse(Course course){
        Course existingCourse = repository.findById(course.getCourse_id()).orElse(null);
        existingCourse.setCourse_name(course.getCourse_name());
        existingCourse.setCourse_duration(course.getCourse_duration());
        return repository.save(existingCourse);
    }
}
