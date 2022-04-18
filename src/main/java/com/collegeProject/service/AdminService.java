package com.collegeProject.service;

import com.collegeProject.model.Admin;
import com.collegeProject.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepository repository;

    public Admin saveAdmin(Admin admin){
       return repository.save(admin);
    }

    public List<Admin> saveAdmins(List<Admin> admins){
        return repository.saveAll(admins);
    }

    public List<Admin> getAdmins(){
        return repository.findAll();
    }

    public Admin getAdminById(String admin_id){
        return repository.findById(admin_id).orElse(null);
    }

    public String deleteAdmin(String admin_id){
         repository.deleteById(admin_id);
        return "Course deleted";
    }

    public Admin updateAccountType(Admin admin){
        Admin existingAdmin = repository.findById(String.valueOf(admin.getAdmin_id())).orElse(null);
        existingAdmin.setAdmin_email(admin.getAdmin_email());
        existingAdmin.setAdmin_password(admin.getAdmin_password());
        existingAdmin.setAdmin_name(admin.getAdmin_name());
        return repository.save(existingAdmin);
    }
}
