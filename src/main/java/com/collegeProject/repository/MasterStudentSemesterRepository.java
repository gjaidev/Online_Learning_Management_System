package com.collegeProject.repository;

import com.collegeProject.model.MasterStudentSemester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterStudentSemesterRepository extends JpaRepository<MasterStudentSemester,Integer> {
}
