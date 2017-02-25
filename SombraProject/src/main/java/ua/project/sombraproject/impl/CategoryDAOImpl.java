package ua.project.sombraproject.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.project.sombraproject.dao.CategoryDAO;
import ua.project.sombraproject.model.Category;

@Service
@Transactional
public class CategoryDAOImpl extends JdbcDaoSupport implements CategoryDAO {

	@Autowired
	public CategoryDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public void saveCategory(Category category) {
		String sql = "INSERT INTO categories(cat_name, cat_descr, cat_img)VALUES(?,?,?)";
		this.getJdbcTemplate().update(sql, category.getCategoryName(), category.getCategoryDescr(), category.getCategoryImg());

	}

	public void updateCategory(Category category) {
		String sql = "UPDATE categories SET cat_name=?, cat_descr=?, cat_img=? " + "WHERE cat_id=?";
		this.getJdbcTemplate().update(sql, category.getCategoryName(), category.getCategoryDescr(), category.getCategoryImg(), category.getCategoryID());
	}

	public void deleteCategory(int categoryID) {
		String sql = "DELETE FROM categories WHERE cat_id=?";

		try {
			this.getJdbcTemplate().update(sql, categoryID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public Category getCategory(int categoryID) {
		String sql = "SELECT * FROM categories cp WHERE cat_id = " + categoryID;
		return this.getJdbcTemplate().query(sql, new ResultSetExtractor<Category>() {

			public Category extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Category category = new Category();
					category.setCategoryID(rs.getInt("cat_id"));
					category.setCategoryName(rs.getString("cat_name"));
					category.setCategoryDescr(rs.getString("cat_descr"));
					category.setCategoryImg(rs.getString("cat_img"));

					return category;
				}

				return null;
			}
		});
	}

	public List<String> categoryNameList() {
		String sql = "SELECT cat_name FROM categories";
		try {
			List<String> categoryNameList = this.getJdbcTemplate().query(sql, new RowMapper<String>() {

				public String mapRow(ResultSet rs, int rowNum) throws SQLException {
					Category categoryNameList = new Category();
					categoryNameList.setCategoryName(rs.getString("cat_name"));

					return categoryNameList.getCategoryName();
				}
			});
			return categoryNameList;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public List<Category> categoryList() {
		String sql = "SELECT * FROM categories";
		try {
			List<Category> categoryList = this.getJdbcTemplate().query(sql, new RowMapper<Category>() {

				public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
					Category categoryList = new Category();

					categoryList.setCategoryID(rs.getInt("cat_id"));
					categoryList.setCategoryName(rs.getString("cat_name"));
					categoryList.setCategoryDescr(rs.getString("cat_descr"));
					categoryList.setCategoryImg(rs.getString("cat_img"));

					return categoryList;
				}
			});
			return categoryList;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public int getCategoryID(String categoryName) {
		String sql = "SELECT cat_id FROM categories WHERE cat_name=?";
		try {
			return Integer.valueOf(this.getJdbcTemplate().queryForObject(sql, new Object[] { categoryName }, String.class));
		} catch (EmptyResultDataAccessException e) {
			return -1;
		}
	}
}
