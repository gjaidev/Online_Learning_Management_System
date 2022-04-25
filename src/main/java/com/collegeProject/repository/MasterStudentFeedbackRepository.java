package com.collegeProject.repository;

import com.collegeProject.model.MasterStudentFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterStudentFeedbackRepository extends JpaRepository<MasterStudentFeedback,Integer> {
}
