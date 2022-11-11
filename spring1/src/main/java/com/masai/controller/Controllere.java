package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Service.studentService;
import com.masai.model.Student;

@RestController
public class Controllere {
	
	
	@Autowired
	private studentService sser;
	
	
	@PostMapping("/saveStud")
	public ResponseEntity<Student> saveStudent( @RequestBody Student stud ){

		
		Student st = sser.saveStudent(stud);
		
		return new ResponseEntity<Student>(st, HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/getStud/{roll}")
	private ResponseEntity<Student> getStudentById(@PathVariable("roll")  int roll){
		
		Student s = sser.findById(roll);
		
		return new ResponseEntity<Student>(s,HttpStatus.OK);
		
	}
	
	

}
