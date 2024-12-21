package com.jpahibernate.example.student_management_db.repository;

import com.jpahibernate.example.student_management_db.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// class - interface - implemnts
// interface-interface - extends
// class-class - extends

// repository contains code for database operations
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
