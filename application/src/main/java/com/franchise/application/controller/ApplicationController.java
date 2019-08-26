package com.franchise.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.franchise.application.bean.Application;
import com.franchise.application.service.ApplicationService;

@Controller
public class ApplicationController {
	
	@Autowired
	ApplicationService applicationService;
	
	@GetMapping("/")
    public String index() {
        return "redirect:/application";
    }
	
	@GetMapping("/application")
    public ModelAndView showForm() {
        return new ModelAndView("applicationHome", "application", new Application());
    }
	
	@PostMapping("/addApplication")
    public String submit(Application application, Model model) {
		applicationService.createApplication(application);
		
        /*model.addAttribute("application", application);
        model.addAttribute("name", application.getName());
        model.addAttribute("contactNumber", application.getContactNumber());
        model.addAttribute("id", application.getId());*/
        return "applicationView";
    }
 
 
}