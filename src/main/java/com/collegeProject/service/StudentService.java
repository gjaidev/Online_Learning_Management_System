package com.collegeProject.service;

import com.collegeProject.model.*;
import com.collegeProject.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private SemesterRepository semesterRepository;
    @Autowired
    private FeesRepository feesRepository;
    @Autowired
    private ExamRepository examRepository;
    @Autowired
    private AssignmentRepository assignmentRepository;
    @Autowired
    private ForumRepository forumRepository;
    @Autowired
    private GradeRepository gradeRepository;
    @Autowired
    private InstructorRepository instructorRepository;
    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public Student saveStudent(Student student){
       return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student getStudentById(int Student_id){
        return repository.findById(Student_id).orElse(null);
    }

    public String deleteStudent(int Student_id){
         repository.deleteById(Student_id);
        return "Student deleted";
    }

    public Student updateStudent(Student student){
        Student existingStudent = repository.findById(student.getStudent_id()).orElse(null);
        existingStudent.setStudent_email(student.getStudent_email());
        existingStudent.setStudent_address(student.getStudent_address());
        //existingStudent.setStudent_courses(student.getStudent_courses());
        existingStudent.setStudent_name(student.getStudent_name());
        existingStudent.setStudent_phone_number(student.getStudent_phone_number());
        return repository.save(existingStudent);
    }

    public StudentDetails getStudentDetails(int student_id) {
        Student existingStudent = repository.findById(student_id).orElse(null);
        List<StudentCourse> studentCourses = studentCourseRepository.findAll();
        List<StudentCourse> requiredStuCourses = new ArrayList<>();
        for(int i=0;i<studentCourses.size();i++){
            if(studentCourses.get(i).getStudent_id()==student_id){
                requiredStuCourses.add(studentCourses.get(i));
            }
        }
        List<Course> coursesExisting = courseRepository.findAll();
        List<Course> courses = new ArrayList<>();
        for(int j=0;j<requiredStuCourses.size();j++){
            for(int k=0;k<coursesExisting.size();k++){
                if(requiredStuCourses.get(j).getCourse_id()==coursesExisting.get(k).getCourse_id()){
                    courses.add(coursesExisting.get(k));
                }
            }
        }
        List<Semester> existingSemesters = semesterRepository.findAll();
        Semester existingSemester = new Semester();
        for(int i=0;i<existingSemesters.size();i++){
            if(existingSemesters.get(i).getStudent_id()==student_id){
                existingSemester = existingSemesters.get(i);
            }
        }
        List<Fees> existingFees = feesRepository.findAll();
        Fees fees = new Fees();
        for(int i=0;i<existingFees.size();i++){
            if(existingFees.get(i).getStudent_id()==student_id){
                fees = existingFees.get(i);
            }
        }
        List<Exam> allExams = examRepository.findAll();
        List<Exam> reqExams = new ArrayList<>();
        for(int i=0;i<allExams.size();i++){
            if(allExams.get(i).getStudent_id()==student_id){
                reqExams.add(allExams.get(i));
            }
        }
        List<Assignment> allAssignments = assignmentRepository.findAll();
        List<Assignment> reqAssigments = new ArrayList<>();
        for(int i=0;i<allAssignments.size();i++){
            if(allAssignments.get(i).getStudent_id()==student_id){
                reqAssigments.add(allAssignments.get(i));
            }
        }
        List<Grade> allGrades = gradeRepository.findAll();
        List<Grade> reqGrades = new ArrayList<>();
        for(int i=0;i<reqExams.size();i++){
            for(int j=0;j<allGrades.size();j++)
            if(reqExams.get(i).getExam_no()==allGrades.get(0).getExam_no()){
                reqGrades.add(allGrades.get(j));
            }
        }
        List<Instructor> allInstructors = instructorRepository.findAll();
        List<Instructor> reqInstructors = new ArrayList<>();
        for(int i=0;i<allInstructors.size();i++){
            for(int j=0;j<courses.size();j++){
                if(allInstructors.get(i).getCourse_id()==courses.get(j).getCourse_id()){
                    reqInstructors.add(allInstructors.get(i));
                }
            }
        }
        List<Forum> allForums = forumRepository.findAll();
        List<Forum> reqForums = new ArrayList<>();
        for(int i=0;i<allForums.size();i++){
            if(allForums.get(i).getStudent_id()==student_id){
                reqForums.add(allForums.get(i));
            }
        }
        StudentDetails studentDetails = new StudentDetails();
        studentDetails.setStudent_email(existingStudent.getStudent_email());
        studentDetails.setStudent_name(existingStudent.getStudent_name());
        studentDetails.setStudent_phone_number(existingStudent.getStudent_phone_number());
        studentDetails.setStudent_address(existingStudent.getStudent_address());
        studentDetails.setStudent_id(existingStudent.getStudent_id());
        studentDetails.setStudent_courses(courses);
        studentDetails.setStudent_exams(reqExams);
        studentDetails.setStudent_grades(reqGrades);
        studentDetails.setStudent_assignments(reqAssigments);
        studentDetails.setStudent_semester(existingSemester);
        studentDetails.setStudent_fee(fees);
        studentDetails.setStudent_instructors(reqInstructors);
        studentDetails.setStudent_forums(reqForums);
        return studentDetails;
    }
}
