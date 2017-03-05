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

import ua.project.sombraproject.dao.GoodsDAO;
import ua.project.sombraproject.mapper.GoodsMapper;
import ua.project.sombraproject.model.Goods;

@Service
@Transactional
public class GoodsDAOImpl extends JdbcDaoSupport implements GoodsDAO {
	final String AVAILABLE = "AVAILABLE";
	final String NOT_AVAILABLE = "NOT_AVAILABLE";
	final String INSERT_GOODS = "INSERT INTO goods(cat_id, prod_id, goods_name, goods_price, goods_descr, goods_avail, img_path_first, img_path_second, img_path_third)VALUES(?,?,?,?,?,'" + AVAILABLE + "',?,?,?)";
	final String UPDATE_GOODS = "UPDATE goods SET cat_id=?, prod_id=?, goods_name=?, goods_price=?, goods_descr=?, goods_avail='" + AVAILABLE + "', img_path_first=?, img_path_second=?, img_path_third=? WHERE goods_id =?";
	final String DELETE_GOODS = "DELETE FROM goods WHERE goods_id=?";
	final String DISABLE_GOODS = "UPDATE goods SET goods_avail = '" + NOT_AVAILABLE + "' WHERE goods_id = ?";
	final String ENABLE_GOODS = "UPDATE goods SET goods_avail = '" + AVAILABLE + "' WHERE goods_id = ?";
	final String SELECT_ALL_GOODS = "SELECT * FROM goods";
	final String FILTER_GOODS_BY_PRICE = "SELECT * FROM goods WHERE goods_price BETWEEN ? AND ?";
	final String FILTER_GOODS_BY_NAME = "SELECT * FROM goods WHERE goods_name LIKE '%?%'";
	final String FILTER_GOODS_BY_CATEGORY = "SELECT * FROM goods WHERE cat_id = ";
	final String FILTER_GOODS_BY_ID = "SELECT * FROM goods WHERE goods_id = ";

	@Autowired
	public GoodsDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public void newGoods(Goods goods) {
		this.getJdbcTemplate().update(INSERT_GOODS, goods.getGoodsCategoryID(), goods.getGoodsProducerID(), goods.getGoodsName(), goods.getGoodsPrice(), goods.getGoodsDescr(), goods.getGoodsFirstImg(), goods.getGoodsSecondImg(),
				goods.getGoodsThirdImg());
	}

	public void updateGoods(Goods goods) {
		this.getJdbcTemplate().update(UPDATE_GOODS, goods.getGoodsCategoryID(), goods.getGoodsProducerID(), goods.getGoodsName(), goods.getGoodsPrice(), goods.getGoodsDescr(), goods.getGoodsFirstImg(), goods.getGoodsSecondImg(),
				goods.getGoodsThirdImg(), goods.getGoodsID());
	}

	public void deleteGoods(int goodsID) {
		doUpdate(DELETE_GOODS, goodsID);
	}

	public void disableGoods(int goodsID) {
		doUpdate(DISABLE_GOODS, goodsID);
	}

	public void enableGoods(int goodsID) {
		doUpdate(ENABLE_GOODS, goodsID);
	}

	public List<Goods> allGoodsList() {
		Object[] params = new Object[] {};
		return doQuery(SELECT_ALL_GOODS, params);
	}

	public List<Goods> filterByPrice(double minPrice, double maxPrice) {
		Object[] params = new Object[] { minPrice, maxPrice };
		return doQuery(FILTER_GOODS_BY_PRICE, params);
	}

	public List<Goods> filterByName(String goodsName) {
		Object[] params = new Object[] { goodsName };
		return doQuery(FILTER_GOODS_BY_NAME, params);
	}

	public List<Goods> filterByCategory(int goodsCategoryID) {
		try {
			List<Goods> goodsList = this.getJdbcTemplate().query(FILTER_GOODS_BY_CATEGORY + goodsCategoryID, new RowMapper<Goods>() {

				public Goods mapRow(ResultSet rs, int rowNum) throws SQLException {
					Goods goodsList = new Goods();
					goodsList.setGoodsID(rs.getInt("goods_id"));
					goodsList.setGoodsName(rs.getString("goods_name"));
					goodsList.setGoodsPrice(Double.parseDouble(rs.getString("goods_price")));
					goodsList.setGoodsFirstImg(rs.getString("img_path_first"));

					return goodsList;
				}
			});
			return goodsList;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public void doUpdate(String sql, int goodsID) {
		try {
			this.getJdbcTemplate().update(sql, goodsID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public List<Goods> doQuery(String sql, Object[] params) {
		try {
			List<Goods> goodsList = this.getJdbcTemplate().query(sql, params, new GoodsMapper());
			return goodsList;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public Goods getGoodsByID(int goodsID) {
		return this.getJdbcTemplate().query(FILTER_GOODS_BY_ID + goodsID, new ResultSetExtractor<Goods>() {

			public Goods extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Goods goods = new Goods();
					goods.setGoodsID(rs.getInt("goods_id"));
					goods.setGoodsCategoryID(rs.getInt("cat_id"));
					goods.setGoodsProducerID(rs.getInt("prod_id"));
					goods.setGoodsName(rs.getString("goods_name"));
					goods.setGoodsPrice(Double.parseDouble(rs.getString("goods_price")));
					goods.setGoodsDescr(rs.getString("goods_descr"));
					goods.setGoodsAvail(rs.getString("goods_avail"));
					goods.setGoodsFirstImg(rs.getString("img_path_first"));
					goods.setGoodsSecondImg(rs.getString("img_path_second"));
					goods.setGoodsThirdImg(rs.getString("img_path_third"));
					return goods;
				}
				return null;
			}
		});
	}
}
