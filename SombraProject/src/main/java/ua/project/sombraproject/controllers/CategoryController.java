package ua.project.sombraproject.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ua.project.sombraproject.dao.CategoryDAO;
import ua.project.sombraproject.model.Category;

@Controller
public class CategoryController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/admin/categoriesList" }, method = RequestMethod.GET)
	public ModelAndView categoriesListPage(ModelAndView model) throws IOException {
		model.addObject("categoryList", categoryDAO.categoryList());
		model.setViewName("categoryListPage");
		return model;
	}

	@RequestMapping(value = "/admin/addCategory", method = RequestMethod.POST)
	public @ResponseBody
	Category newCategory(HttpServletRequest request) throws Exception {
		Category category = new Category();

		category.setCategoryName(request.getParameter("categoryName"));
		category.setCategoryDescr(request.getParameter("categoryDescr"));
		category.setCategoryImg(request.getParameter("categoryImg"));

		categoryDAO.saveCategory(category);

		return category;
	}

	@RequestMapping(value = "/admin/deleteCategory", method = RequestMethod.GET)
	public ModelAndView deleteCategory(HttpServletRequest request) {
		categoryDAO.deleteCategory(Integer.parseInt(request.getParameter("categoryID")));
		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping(value = "/admin/editingCategory", method = RequestMethod.GET)
	public ModelAndView editCategoryPage(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("editCategoryPage");
		model.addObject("editCategory", categoryDAO.getCategory(Integer.parseInt(request.getParameter("categoryID"))));
		return model;
	}

	@RequestMapping(value = "/admin/editCategory", method = RequestMethod.POST)
	public @ResponseBody
	Category editCategory(HttpServletRequest request) {
		Category category = new Category();

		System.out.println(request.getParameter("categoryID"));

		category.setCategoryName(request.getParameter("categoryName"));
		category.setCategoryDescr(request.getParameter("categoryDescr"));
		category.setCategoryImg(request.getParameter("categoryImg"));
		category.setCategoryID(Integer.parseInt(request.getParameter("categoryID")));

		categoryDAO.updateCategory(category);
		return category;
	}

}
