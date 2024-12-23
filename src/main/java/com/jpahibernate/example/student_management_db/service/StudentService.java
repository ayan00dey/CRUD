package com.jpahibernate.example.student_management_db.service;

import com.jpahibernate.example.student_management_db.model.Student;
import com.jpahibernate.example.student_management_db.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // business logic and validations etc...
public class StudentService {

    @Autowired // creates an internal bean(object of IOC)
    private StudentRepository studentRepository;

    public String addStudent(Student studentRequest){
        // option 1 . write our own logic like own query for saving student into database
        // option 2 . using the inbuilt methods from JPA and save the student
        studentRepository.save(studentRequest);
        return "Student saved successfully";
    }

    public List<Student> getAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public Student getStudentById(int id){
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.get();
    }

    public String deleteStudentById(int id){
        studentRepository.deleteById(id);
        return "Student with id : "+id+" deleted successfully";
    }
}
