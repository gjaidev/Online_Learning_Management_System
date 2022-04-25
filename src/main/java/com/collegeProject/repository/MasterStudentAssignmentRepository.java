package com.collegeProject.repository;

import com.collegeProject.model.MasterStudentAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterStudentAssignmentRepository extends JpaRepository<MasterStudentAssignment,Integer> {
}
