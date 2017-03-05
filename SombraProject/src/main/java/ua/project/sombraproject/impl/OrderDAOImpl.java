package ua.project.sombraproject.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.project.sombraproject.dao.OrderDAO;
import ua.project.sombraproject.model.Order;

@Service
@Transactional
public class OrderDAOImpl extends JdbcDaoSupport implements OrderDAO {
	final String INSERT_ORDER = "INSERT INTO orders(goods_id, client_id, order_amount, order_price, delivery_meth, payment_meth)VALUES(?,?,?,?,?,?)";
	final String DELETE_ORDER = "DELETE FROM orders WHERE order_id=?";
	final String SELECT_ALL_ORDERS = "SELECT * FROM orders";

	@Autowired
	public OrderDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public void newOrder(Order order) {
		this.getJdbcTemplate().update(INSERT_ORDER, order.getOrderGoodsID(), order.getOrderClientID(), order.getOrderAmount(), order.getOrderPrice(), order.getDeliveryMeth(), order.getPaymentMeth());
	}

	public void deleteOrder(int orderID) {
		try {
			this.getJdbcTemplate().update(DELETE_ORDER, orderID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public List<Order> orderList() {
		try {
			List<Order> orderList = this.getJdbcTemplate().query(SELECT_ALL_ORDERS, new RowMapper<Order>() {

				public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
					Order orderList = new Order();

					orderList.setOrderID(rs.getInt("order_id"));
					orderList.setOrderGoodsID(rs.getInt("goods_id"));
					orderList.setOrderClientID(rs.getInt("client_id"));
					orderList.setOrderAmount(rs.getInt("order_amount"));
					orderList.setOrderPrice(rs.getDouble("order_price"));
					orderList.setDeliveryMeth(rs.getString("delivery_meth"));
					orderList.setPaymentMeth(rs.getString("payment_meth"));

					return orderList;
				}
			});
			return orderList;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
}
