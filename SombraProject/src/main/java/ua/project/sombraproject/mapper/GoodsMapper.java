package ua.project.sombraproject.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ua.project.sombraproject.model.Goods;

public class GoodsMapper implements RowMapper<Goods> {

	public Goods mapRow(ResultSet rs, int rowNum) throws SQLException {

		return new Goods(rs.getInt("goods_id"), rs.getInt("cat_id"), rs.getInt("prod_id"), rs.getString("goods_name"), rs.getDouble("goods_price"), rs.getString("goods_descr"), rs.getString("goods_avail"), rs.getString("img_path_first"),
				rs.getString("img_path_second"), rs.getString("img_path_third"));
	}

}