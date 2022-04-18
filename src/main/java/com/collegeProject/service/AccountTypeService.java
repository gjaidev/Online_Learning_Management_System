package com.collegeProject.service;

import com.collegeProject.model.AccountType;
import com.collegeProject.model.Instructor;
import com.collegeProject.model.Student;
import com.collegeProject.repository.AccountTypeRepository;
import com.collegeProject.repository.InstructorRepository;
import com.collegeProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountTypeService {
    @Autowired
    private AccountTypeRepository repository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private InstructorRepository instructorRepository;

    public List<AccountType> saveAccountTypes(List<AccountType> accountTypes){
        return repository.saveAll(accountTypes);
    }

    public List<AccountType> getAccountTypes(){
        return repository.findAll();
    }

    public AccountType getAccountTypeById(int account_id){
        return repository.findById(account_id).orElse(null);
    }

    public String deleteAccountType(int account_id){
         repository.deleteById(account_id);
        return "Course deleted";
    }

    public AccountType updateAccountType(AccountType accountType){
        AccountType existingaccountType = repository.findById(accountType.getAccount_id()).orElse(null);
        existingaccountType.setAccount_email(accountType.getAccount_email());
        existingaccountType.setAccount_Password(accountType.getAccount_Password());
        return repository.save(existingaccountType);
    }
    public String saveAccountType(AccountType accountType){
        List<AccountType> allUsers = repository.findAll();
        for(int i=0;i<allUsers.size()-1;i++){
            if((allUsers.get(i).getAccount_id()==accountType.getAccount_id())&&
                    allUsers.get(i).getAccount_email().equals(accountType.getAccount_email())){
                return "User already exists";
            }
        }
        repository.save(accountType);
        return "User saved";
    }


    public AccountType getAccountTypeByIdAndPwd(int userName,String passWord){
        List<AccountType> allUsers = repository.findAll();
        AccountType userDetails = new AccountType();
        for(int i=0;i<allUsers.size()-1;i++){
            if((allUsers.get(i).getAccount_id()==userName) && allUsers.get(i).getAccount_Password().equals(passWord)){
                userDetails = allUsers.get(i);
                break;
            }
        }
        if(userDetails.getAccount_email().isEmpty()){
            userDetails.setAccount_id(0);
            userDetails.setAccount_Password(null);
            userDetails.setAccount_email(null);
        }
        return userDetails;
    }

    public String getUserRole(int userId) {
        List<Student> allStudents = studentRepository.findAll();
        for(int i=0;i<allStudents.size();i++){
            if(allStudents.get(i).getStudent_id()==userId){
                return "student";
            }
        }
        return "instructor";
    }
}
