package com.rakuten.training.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.training.dao.UserDao;
import com.rakuten.training.ui.DashboardUi;

@Service
public class InternalServiceImpl implements InternalService {

	
	UserDao dao;
	
	@Autowired
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	@Override
	public DashboardUi createNewUser(DashboardUi toBeCreated) {
		
//		if(toBeCreated.getEmail().equals(dao.findByEmail(toBeCreated.getEmail()))) {
//			
//		}else {
//			String pass = toBeCreated.getPassword();
//			if(pass.length()>=8) {
//				dao.save(toBeCreated);
//			}
//			}
		return dao.save(toBeCreated);
	}

	@Override
	public DashboardUi findUserBy_Id(int id) {
		DashboardUi existing = dao.findById(id);
		return existing;
	}

	@Override
	public List<DashboardUi> findAllUsers() {
		return dao.findAll();
	}
	
	@Override
	public void removeUser(int id) {
		 dao.deleteUserById(id);
	}
	

}
