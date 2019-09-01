package com.franchise.application.service;

import java.util.List;

import com.franchise.application.bean.Application;

public interface ApplicationService {
	public Application createApplication(Application application);
	public List<Application> findAll();
}