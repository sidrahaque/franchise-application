package com.franchise.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.franchise.application.bean.Application;
import com.franchise.application.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements  ApplicationService{
	
	@Autowired
	ApplicationRepository applicationRepository;
	
	public Application createApplication(Application application) {
		return applicationRepository.save(application);
	}
	
	public List<Application> findAll(){
		return applicationRepository.findAll();
	}
	
}