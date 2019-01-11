package com.iseehear.app.struts.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.struts2.dispatcher.DefaultActionSupport;

import com.iseehear.app.dao.CategoryDao;
import com.iseehear.app.dao.StudentDao;
import com.iseehear.app.entity.Category;
import com.iseehear.app.entity.Student;

public class RegisterAction extends DefaultActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired StudentDao studentDao;
	@Autowired CategoryDao categoryDao;
	
	
	private String name;
	private String gender;
	private String grade;
	
	public String registerStudent() {
//		for simplicity, i skip the validation and verification
		Student student = new Student();
		Category category = new Category();
		
		
		if(gender.equals("Male")) {
			student.setGender(true);
		}else {
			student.setGender(false);
		}

		student.setName(name);
		
		category = categoryDao.findById(Integer.parseInt(grade));
		student.setCategory(category);
		studentDao.saveStudents(student);
		
		return SUCCESS;
		
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
