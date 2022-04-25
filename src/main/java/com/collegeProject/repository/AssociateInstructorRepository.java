package com.collegeProject.repository;

import com.collegeProject.model.AssociateInstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociateInstructorRepository extends JpaRepository<AssociateInstructor,Integer> {
}
