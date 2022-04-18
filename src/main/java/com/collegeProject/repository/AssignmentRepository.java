package com.collegeProject.repository;

import com.collegeProject.model.AccountType;
import com.collegeProject.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment,String> {
}
