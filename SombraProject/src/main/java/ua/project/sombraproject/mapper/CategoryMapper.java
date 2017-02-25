package ua.project.sombraproject.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ua.project.sombraproject.model.Category;

public class CategoryMapper implements RowMapper<Category> {

	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {

		return new Category(rs.getString("cat_name"), rs.getString("cat_descr"), rs.getString("cat_img"));
	}

}
