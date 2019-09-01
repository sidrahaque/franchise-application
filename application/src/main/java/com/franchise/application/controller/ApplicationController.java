package com.franchise.application.controller;

import org.springframework.http.MediaType;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.franchise.application.bean.Application;
import com.franchise.application.service.ApplicationService;


@RestController
@RequestMapping("/")
public class ApplicationController {
	
	@Autowired
	ApplicationService applicationService;
	
	@PostMapping(value= "/applications", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Application createApplication(@Valid @RequestBody Application app) {
		return applicationService.createApplication(app);
	}
	
	@GetMapping("/applications")
	public List<Application> getAllApplications(){
		return applicationService.findAll();
	}
	
	/*
	@GetMapping("/application")
    public ModelAndView showForm() {
        return new ModelAndView("applicationHome", "application", new Application());
    }
	@PostMapping("/addApplication")
    public String submit(Application application, Model model) {
		applicationService.createApplication(application);
		
        model.addAttribute("application", application);
        model.addAttribute("name", application.getName());
        model.addAttribute("contactNumber", application.getContactNumber());
        model.addAttribute("id", application.getId());
        return "applicationView";
    }
	 */
 
}