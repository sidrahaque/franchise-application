package com.franchise.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.franchise.application.bean.Application;
import com.franchise.application.repository.ApplicationRepository;

@Service
@Transactional
public class ApplicationServiceImpl implements  ApplicationService{
	
	@Autowired
	ApplicationRepository applicationRepository;
	
	public void createApplication(Application application) {
		applicationRepository.save(application);
	}
	
}