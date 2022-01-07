package com.example.flyway.dao;

import com.example.flyway.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
