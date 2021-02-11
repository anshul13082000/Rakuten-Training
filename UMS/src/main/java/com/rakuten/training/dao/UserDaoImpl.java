package com.rakuten.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.training.ui.DashboardUi;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{
	@Autowired
	EntityManager em;
	
	
	@Override
	public DashboardUi save(DashboardUi toBeSaved) {
//		System.out.println("****************"+toBeSaved.getEmail()+"**********");
		em.persist(toBeSaved);
		return toBeSaved;
	}

	@Override
	public DashboardUi findById(int id) {
		DashboardUi p = em.find(DashboardUi.class, id);
//		System.out.println("****************"+p.getId()+"**********");
		return p;
	}

	@Override
	public String findByEmail(String mail) {
		DashboardUi p = em.find(DashboardUi.class, mail);
		return p.getEmail();
	}

	@Override
	public List<DashboardUi> findAll() {
		Query q = em.createQuery("select p from DashboardUi as p");
		return q.getResultList();

	}
	
	@Override
	public void deleteUserById(int id) {
	 em.remove(em.find(DashboardUi.class, id));
		
	}

	
	
}
