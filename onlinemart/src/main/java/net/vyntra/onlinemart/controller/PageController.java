package net.vyntra.onlinemart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.vyntra.martbackend.dao.CategoryDAO;
import net.vyntra.martbackend.dto.Category;
//https://stackoverflow.com/questions/62773333/http-status404-not-found-in-maven-spring-mvc-project
@Controller
public class PageController {
	
<<<<<<< HEAD
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value= "/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value= "/contact")
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Contact");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	@RequestMapping(value= {"/show/all/products"})
	public ModelAndView showAllProducts()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","Home");
		
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value= "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id)
=======
	@RequestMapping(value= {"/","/home","/index","/page"})
	public ModelAndView page()
>>>>>>> refs/remotes/origin/master
	{
		ModelAndView mv=new ModelAndView("page");
		
		//category dao to fetch single category
		Category category=null;
		category=categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("category",category);
		
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
}
