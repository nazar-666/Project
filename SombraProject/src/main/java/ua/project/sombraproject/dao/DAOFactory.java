package ua.project.sombraproject.dao;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DAOFactory {

	public abstract Connection getConnection() throws SQLException;

	// public abstract CategoryDAO getCategoryDAO();

	// public abstract ClientDAO getClientDAO();

	// public abstract GoodsDAO getGoodsDAO();
	//
	// public abstract OrderDAO getOrderDAO();
	//
	// public abstract ProducerDAO getProducerDAO();

}
