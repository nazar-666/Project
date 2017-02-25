package ua.project.sombraproject.dao;

import java.util.List;

import ua.project.sombraproject.model.Category;

public interface CategoryDAO {

	public void updateCategory(Category category);

	public void saveCategory(Category category);

	public void deleteCategory(int categoryID);

	public int getCategoryID(String categoryName);

	public Category getCategory(int categoryID);

	public List<String> categoryNameList();

	public List<Category> categoryList();
}
