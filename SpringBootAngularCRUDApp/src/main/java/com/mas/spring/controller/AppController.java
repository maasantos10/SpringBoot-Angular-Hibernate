package com.mas.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * MAS - CRUD - Spring / JPA / AngularJS / Hibernate
 * Description: Controller
 */

@Controller
public class AppController {

	// Here we set the header of HTML page
	@RequestMapping("/")
	String home(ModelMap modal){
		modal.addAttribute("title", "Amazing Example of CRUD with Java Spring, Hibernate and AngularJS");
		return "index";
	}

	@RequestMapping("/partials/{page}")
	String partialHandler(@PathVariable("page") final String page) {
		return page;
	}
	
}
