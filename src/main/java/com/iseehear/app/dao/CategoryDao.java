package com.iseehear.app.dao;
// Generated 11-Dec-2018 10:20:45 PM by Hibernate Tools 4.3.5.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iseehear.app.entity.Category;

/**
 * Home object for domain model class Category.
 * @see dao.Category
 * @author Hibernate Tools
 */
@Repository
@Stateless
public class CategoryDao {
	

	private static final Log log = LogFactory.getLog(CategoryDao.class);

	@Autowired
    private SessionFactory sessionFactory;
	public Category findById(Integer id) {
		Session session = sessionFactory.getCurrentSession();

		log.debug("getting Category instance with id: " + id);
		try {
			session.beginTransaction();
			Category category = (Category) session.get(Category.class, id);
			session.getTransaction().commit();
			return category;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

//	public void persist(Category transientInstance) {
//		log.debug("persisting Category instance");
//		try {
//			entityManager.persist(transientInstance);
//			log.debug("persist successful");
//		} catch (RuntimeException re) {
//			log.error("persist failed", re);
//			throw re;
//		}
//	}
//
//	public void remove(Category persistentInstance) {
//		log.debug("removing Category instance");
//		try {
//			entityManager.remove(persistentInstance);
//			log.debug("remove successful");
//		} catch (RuntimeException re) {
//			log.error("remove failed", re);
//			throw re;
//		}
//	}
//
//	public Category merge(Category detachedInstance) {
//		log.debug("merging Category instance");
//		try {
//			Category result = entityManager.merge(detachedInstance);
//			log.debug("merge successful");
//			return result;
//		} catch (RuntimeException re) {
//			log.error("merge failed", re);
//			throw re;
//		}
//	}
//
//	public Category findById(Integer id) {
//		log.debug("getting Category instance with id: " + id);
//		try {
//			Category instance = entityManager.find(Category.class, id);
//			log.debug("get successful");
//			return instance;
//		} catch (RuntimeException re) {
//			log.error("get failed", re);
//			throw re;
//		}
//	}
}
