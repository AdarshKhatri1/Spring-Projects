package com.masai.Service;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repo.studentDao;

@Service
public class studentServiceImpl implements studentService{

	@Autowired
	private studentDao sdao;
	
	
	@Override
	public Student saveStudent(Student student) {
	Student stud =	sdao.save(student);
	
	return stud;
	}

	@Override
	public Student findById(int id) {
		Optional<Student> stud = sdao.findById(id);
		
			return stud.get();
		
		
	}
	
	
	

}
