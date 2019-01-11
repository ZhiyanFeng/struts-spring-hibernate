package com.iseehear.app.dao;
// Generated 11-Dec-2018 10:20:45 PM by Hibernate Tools 4.3.5.Final

import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.iseehear.app.entity.Category;
import com.iseehear.app.entity.Student;

/**
 * Home object for domain model class Student.
 * @see dao.Student
 * @author Hibernate Tools
 */
@Repository
@Stateless
public class StudentDao {

	private static final Log log = LogFactory.getLog(StudentDao.class);

//	@PersistenceContext(unitName="studentDao")
//	private EntityManager entityManager;
	@Autowired
    private SessionFactory sessionFactory;

//	public void persist(Student transientInstance) {
//		log.debug("persisting Student instance");
//		try {
//			entityManager.persist(transientInstance);
//			log.debug("persist successful");
//		} catch (RuntimeException re) {
//			log.error("persist failed", re);
//			throw re;
//		}
//	}
//
//	public void remove(Student persistentInstance) {
//		log.debug("removing Student instance");
//		try {
//			entityManager.remove(persistentInstance);
//			log.debug("remove successful");
//		} catch (RuntimeException re) {
//			log.error("remove failed", re);
//			throw re;
//		}
//	}
//
//	public Student merge(Student detachedInstance) {
//		log.debug("merging Student instance");
//		try {
//			Student result = entityManager.merge(detachedInstance);
//			log.debug("merge successful");
//			return result;
//		} catch (RuntimeException re) {
//			log.error("merge failed", re);
//			throw re;
//		}
//	}
//
//	public Student findById(Integer id) {
//		log.debug("getting Student instance with id: " + id);
//		try {
//			Student instance = entityManager.find(Student.class, id);
//			log.debug("get successful");
//			return instance;
//		} catch (RuntimeException re) {
//			log.error("get failed", re);
//			throw re;
//		}
//	}
	@Transactional
    public Integer saveStudents(Student s) {
		Session session = this.sessionFactory.getCurrentSession();
	    session.beginTransaction();
	    Integer id= (Integer) session.save(s);
        session.getTransaction().commit();
	    
	    return id;
		
	}
	
	@Transactional
    public List<Student> getAllStudents() {

//        @SuppressWarnings("unchecked")
//        List<Student> students = (List<Student>) sessionFactory.getCurrentSession().createCriteria(Student.class).list();
        
        //or below query
		Session session = this.sessionFactory.getCurrentSession();
	    session.beginTransaction();
       
          @SuppressWarnings("unchecked") 
          List<Student> students = (List<Student>)session.createQuery("from Student").list();
          session.getTransaction().commit();
//          session.close();
        
        return students;
    }
	
	public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

//	public EntityManager getEntityManager() {
//		return entityManager;
//	}
//
//	public void setEntityManager(EntityManager entityManager) {
//		this.entityManager = entityManager;
//	}
//
//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}
}
