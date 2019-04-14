package com.huangpan.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huangpan.pojo.Student;
import com.huangpan.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/students")
	public String students(Map<String, Object> map,String onlything) {
		List<Student> students=studentService.getStudents();
		map.put("students", students);
		return "list";
		
	}
	

}