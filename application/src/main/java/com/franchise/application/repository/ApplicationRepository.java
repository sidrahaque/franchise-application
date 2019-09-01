package com.franchise.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.franchise.application.bean.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long>
{
	
}
