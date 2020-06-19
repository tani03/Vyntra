package net.vyntra.onlinemart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value= {"/","/home","/index","/page"})
	public ModelAndView page()
	{
		ModelAndView mv=new ModelAndView("page");
		
		return mv;
	}
}
