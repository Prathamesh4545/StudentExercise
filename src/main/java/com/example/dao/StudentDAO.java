package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Student;

public interface StudentDAO extends JpaRepository<Student, Integer>{

}
