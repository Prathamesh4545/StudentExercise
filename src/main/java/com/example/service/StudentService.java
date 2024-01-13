package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDAO;
import com.example.entity.Student;

@Service
public class StudentService {

	@Autowired
	StudentDAO studentDAO;
	
	public Student createStudent(Student student) {
		return studentDAO.save(student);
	}
	
	public List<Student> getAllStudentList(){
		return studentDAO.findAll();
	}
	
	public Optional<Student> findById(int id){
		return studentDAO.findById(id);
	}
	public Student updateStudent(Student student) {
		return studentDAO.save(student);
	}
	
	public String deleteStudent(int id) {
		studentDAO.deleteById(id);
		return "Delete Student Record Successfully!!";
	}
}
