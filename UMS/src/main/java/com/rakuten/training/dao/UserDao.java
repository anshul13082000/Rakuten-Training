package com.rakuten.training.dao;

import java.util.List;

import com.rakuten.training.ui.DashboardUi;

public interface UserDao {

	public DashboardUi save(DashboardUi toBeSaved);
	public DashboardUi findById(int id);
	public String findByEmail(String mail);
	public List<DashboardUi> findAll();
	public void deleteUserById(int id);
	
	
}
