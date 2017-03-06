package ua.project.sombraproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDAOFactory extends DAOFactory {
	private final String user = "root";
	private final String password = "love666";
	private final String url = "jdbc:mysql://localhost:3306/sombra_shop";

	@Override
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}

	// @Override
	// public CategoryDAO getCategoryDAO() {
	// return new CategoryDAOImpl();
	// }

	// @Override
	// public ClientDAO getClientDAO() {
	// return new ClientDAOImpl();
	// }

	// @Override
	// public GoodsDAO getGoodsDAO() {
	// return new GoodsDAOImpl();
	// }
	//
	// @Override
	// public OrderDAO getOrderDAO() {
	// return new OrderDAOImpl();
	// }
	//
	// @Override
	// public ProducerDAO getProducerDAO() {
	// return new ProducerDAOImpl();
	// }

}
