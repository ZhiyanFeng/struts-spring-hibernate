package com.iseehear.app.entity;
// Generated 12-Dec-2018 6:59:01 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.iseehear.app.dao.StudentDao;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name = "student", catalog = "test")
public class Student implements java.io.Serializable {

	/**
	 * 
	 */
	@Autowired StudentDao studentDao;
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private boolean gender;
	private Category category;

	public Student() {
	}

	public Student(String name, boolean gender) {
		this.name = name;
		this.gender = gender;
	}

	public Student(String name, boolean gender, Category category) {
		this.name = name;
		this.gender = gender;
		this.category = category;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "gender", nullable = false)
	public boolean isGender() {
		return this.gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name="student_category", catalog = "test",
    joinColumns= { @JoinColumn(name = "student_id", referencedColumnName="id") },
    inverseJoinColumns = { @JoinColumn(name = "category_id", nullable = false, updatable = false) })
    public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "student_category", catalog = "test", 
//	joinColumns = { @JoinColumn(name = "student_id", referencedColumnName="id") }, 
//	inverseJoinColumns = { @JoinColumn(name = "category_id", nullable = false, updatable = false) })
//	public Set getCategories() {
//		return this.categories;
//	}
//
//	public void setCategories(Set categories) {
//		this.categories = categories;
//	}

}