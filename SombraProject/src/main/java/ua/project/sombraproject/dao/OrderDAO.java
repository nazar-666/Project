package ua.project.sombraproject.dao;

import java.util.List;

import ua.project.sombraproject.model.Order;

public interface OrderDAO {

	public void newOrder(Order order);

	public void deleteOrder(int orderID);

	public List<Order> orderList();

}