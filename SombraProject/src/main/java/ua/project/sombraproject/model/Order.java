package ua.project.sombraproject.model;

import java.io.Serializable;

public class Order implements Serializable {
	private static final long serialVersionUID = 1079033569986492057L;

	private int orderID;
	private int orderGoodsID;
	private String orderGoodsName;
	private int orderClientID;
	private int orderAmount;
	private double orderPrice;
	private String deliveryMeth;
	private String paymentMeth;

	public Order() {
	}

	public Order(int orderID, int orderGoodsID, int orderClientID, int orderAmount, double orderPrice, String deliveryMeth, String paymentMeth) {
		this.orderGoodsID = orderGoodsID;
		this.orderClientID = orderClientID;
		this.orderID = orderID;
		this.orderAmount = orderAmount;
		this.orderPrice = orderPrice;
		this.deliveryMeth = deliveryMeth;
		this.paymentMeth = paymentMeth;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getOrderGoodsID() {
		return orderGoodsID;
	}

	public void setOrderGoodsID(int orderGoodsID) {
		this.orderGoodsID = orderGoodsID;
	}

	public String getOrderGoodsName() {
		return orderGoodsName;
	}

	public void setOrderGoodsName(String orderGoodsName) {
		this.orderGoodsName = orderGoodsName;
	}

	public int getOrderClientID() {
		return orderClientID;
	}

	public void setOrderClientID(int orderClientID) {
		this.orderClientID = orderClientID;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getDeliveryMeth() {
		return deliveryMeth;
	}

	public void setDeliveryMeth(String deliveryMeth) {
		this.deliveryMeth = deliveryMeth;
	}

	public String getPaymentMeth() {
		return paymentMeth;
	}

	public void setPaymentMeth(String paymentMeth) {
		this.paymentMeth = paymentMeth;
	}

}
