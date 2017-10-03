package com.spring.onlineshopper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title", "Home");
		mView.addObject("userClickHome", true);
		return mView;
	}
	
	@RequestMapping(value= "/about")
	public ModelAndView about() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title", "About");
		mView.addObject("userClickAbout", true);
		return mView;
	}
	
	@RequestMapping(value= "/contact")
	public ModelAndView contact() {
		ModelAndView mView = new ModelAndView("page");
		mView.addObject("title", "Contact");
		mView.addObject("userClickContact", true);
		return mView;
	}
		
}
