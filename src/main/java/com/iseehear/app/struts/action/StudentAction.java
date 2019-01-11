package com.iseehear.app.struts.action;

import java.util.List;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.iseehear.app.entity.Student;
import com.iseehear.app.service.StudentService;

public class StudentAction extends DefaultActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7237969414963549996L;
	
	@Autowired
	private StudentService studentService;
	
	private Student student;
	private List<Student> studentList;

	
	public String getAllStudents() {
		studentList = studentService.getAllStudent();
		
		return SUCCESS;
	}

	public String addStudentForm() {
		return SUCCESS;
	}
	
	public String addStudent() {
		return SUCCESS;
	}
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

}
