package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping(name = "student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("addStudent")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping("allStudentInfo")
	public List<Student> getAllStudent(){
		return studentService.getAllStudentList();
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> findById(@PathVariable Integer id){
		return studentService.findById(id);
	}
	
	@PutMapping("/updateStudent/{id}")
	public Student updateStudent(@PathVariable int id,@RequestBody Student student) {
		student.setId(id);
		return studentService.updateStudent(student);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}
}
