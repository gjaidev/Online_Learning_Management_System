package com.collegeProject.repository;

import com.collegeProject.model.MasterSurveyInstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterSurveyInstructorRepository extends JpaRepository<MasterSurveyInstructor,Integer> {
}
