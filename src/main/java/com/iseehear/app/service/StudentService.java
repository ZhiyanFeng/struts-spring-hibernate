package com.iseehear.app.service;

import java.util.List;

import com.iseehear.app.entity.Student;

public interface StudentService {

	public Student getStudent(int id);
	public List<Student> getAllStudent();
}
