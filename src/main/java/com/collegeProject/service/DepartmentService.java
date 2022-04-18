package com.collegeProject.service;

import com.collegeProject.model.Department;
import com.collegeProject.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department){
       return repository.save(department);
    }

    public List<Department> saveDepartments(List<Department> departments){
        return repository.saveAll(departments);
    }

    public List<Department> getDepartments(){
        return repository.findAll();
    }

    public Department getDepartmentByName(int department_id){
        return repository.findById(department_id).orElse(null);
    }

    public String deleteDepartment(int department_id){
         repository.deleteById(department_id);
        return "Department deleted";
    }
}
