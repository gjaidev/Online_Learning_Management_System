package com.collegeProject.repository;

import com.collegeProject.model.MasterStudentExam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterStudentExamRepository extends JpaRepository<MasterStudentExam,Integer> {
}
