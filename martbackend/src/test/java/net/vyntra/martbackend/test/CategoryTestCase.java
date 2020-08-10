package net.vyntra.martbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.vyntra.martbackend.dao.CategoryDAO;
import net.vyntra.martbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		context=new AnnotationConfigApplicationContext();
		context.scan("net.vyntra.martbackend");
		context.refresh();
		
		categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
	}
	
	/*
	 * @Test public void testAddCategory() { category=new Category();
	 * 
	 * category.setName("Laptop"); category.setImageURL("1(1).png");
	 * category.setDescription("This is some description for laptop");
	 * 
	 * assertEquals("Successfully added  a category",true,categoryDAO.add(category))
	 * ; }
	 */
	/*
	 * @Test public void testGetCategory() { category=categoryDAO.get(3);
	 * assertEquals("Successfully fetched single category","Kids",category.getName()
	 * );
	 * 
	 * }
	 */
	

}
