package com.iseehear.app.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iseehear.app.dao.StudentDao;
import com.iseehear.app.entity.Student;
import com.iseehear.app.service.StudentService;

import org.hibernate.SessionFactory;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub

		return studentDao.getAllStudents();
	}
	
}
