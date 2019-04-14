package com.huangpan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huangpan.mapper.StudentMapper;
import com.huangpan.pojo.Student;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;
	public List<Student> getStudents(){
		return studentMapper.getStudents();
	}
	
}
