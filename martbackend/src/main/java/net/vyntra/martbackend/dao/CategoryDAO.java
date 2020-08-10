package net.vyntra.martbackend.dao;

import java.util.List;

import net.vyntra.martbackend.dto.Category;

public interface CategoryDAO {
	
	

	List<Category> list();

	Category get(int id);
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	
}
