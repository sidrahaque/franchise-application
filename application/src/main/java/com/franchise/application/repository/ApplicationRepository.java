package com.franchise.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.franchise.application.bean.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long>
{
	
}
