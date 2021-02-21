package com.bolsaideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsaideas.springboot.di.app.models.service.IService;

@Controller
public class IndexController {

	// @Autowired //Injection
	@Autowired
	// @Qualifier("myComplexService")
	// @Qualifier("mySimpleService")
	private IService service;

	/*
	 * public IndexController(IService service) { this.service = service; }
	 */

	@GetMapping({ "/index", "/", "" })
	public String index(Model model) {
		model.addAttribute("object", service.operation());
		return "index";
	}

	/*
	 * @Autowired public void setService(IService service) { this.service = service;
	 * }
	 */

}
