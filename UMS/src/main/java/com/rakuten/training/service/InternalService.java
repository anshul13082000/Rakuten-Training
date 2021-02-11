package com.rakuten.training.service;

import java.util.List;

import com.rakuten.training.ui.DashboardUi;

public interface InternalService {
	
	public DashboardUi createNewUser(DashboardUi toBeCreated);
	public DashboardUi findUserBy_Id(int id);
	public List<DashboardUi> findAllUsers();
	public void removeUser(int id);

}
