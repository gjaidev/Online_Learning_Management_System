package com.collegeProject.controller;

import com.collegeProject.model.*;
import com.collegeProject.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class OnlineLearningController {
    @Autowired
    private AccountTypeService accountTypeService;
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;
    @Autowired
    private FeesService feesService;
    @Autowired
    private SemesterService semesterService;
    @Autowired
    private InstructorService instructorService;
    @Autowired
    private ForumService forumService;
    @Autowired
    private FeedbackService feedbackService;


    @RequestMapping(value = "/getUserDetails",method = RequestMethod.GET)
    public AccountType getUsersData(@RequestParam int userName, @RequestParam String passWord){
        return accountTypeService.getAccountTypeByIdAndPwd(userName,passWord);
    }

    @RequestMapping(value = "/saveUserDetails",method = RequestMethod.PUT)
    public String saveUsersData(@RequestBody AccountType user){
        return accountTypeService.saveAccountType(user);
    }


    @RequestMapping(value = "/getStudentDetails",method = RequestMethod.GET)
    public StudentDetails getStudentsDetails(@RequestParam int student_id){
        StudentDetails studentDetails = studentService.getStudentDetails(student_id);
        return studentDetails;
    }

    @RequestMapping(value = "/getInstructorDetails",method = RequestMethod.GET)
    public InstructorDetails getInstructorDetails(@RequestParam int instructor_id){
        return instructorService.getInstructorDetails(instructor_id);
    }

    @RequestMapping(value = "/createForum",method = RequestMethod.PUT)
    public Forum saveForumDetails(@RequestBody Forum forum){
        return forumService.saveForum(forum);
    }

    @RequestMapping(value = "/saveAccountDetails",method = RequestMethod.PUT)
    public String saveAccountType(@RequestBody AccountType accountType){
        return accountTypeService.saveAccountType(accountType);
    }

    @RequestMapping(value = "/saveFeedback",method = RequestMethod.PUT)
    public Feedback saveFeedback(@RequestBody Feedback feedback){
        return feedbackService.saveFeedback(feedback);
    }

    @RequestMapping(value = "/getUserRole",method = RequestMethod.GET)
    public String getUserRole(@RequestParam int userId){
        return accountTypeService.getUserRole(userId);
    }
}
