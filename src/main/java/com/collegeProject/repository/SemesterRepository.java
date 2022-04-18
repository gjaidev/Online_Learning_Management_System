package com.collegeProject.repository;

import com.collegeProject.model.Course;
import com.collegeProject.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepository extends JpaRepository<Semester,Integer> {
}
