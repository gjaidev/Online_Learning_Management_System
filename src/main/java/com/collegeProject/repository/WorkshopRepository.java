package com.collegeProject.repository;

import com.collegeProject.model.Admin;
import com.collegeProject.model.Workshop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkshopRepository extends JpaRepository<Workshop,String> {
}
