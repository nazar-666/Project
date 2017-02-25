package ua.project.sombraproject.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ua.project.sombraproject.dao.GoodsDAO;
import ua.project.sombraproject.dao.OrderDAO;
import ua.project.sombraproject.model.Order;

@Controller
public class OrderController {

	private List<Order> list = new ArrayList<Order>();
	@Autowired
	private OrderDAO orderDAO;
	@Autowired
	private GoodsDAO goodsDAO;

	@RequestMapping(value = { "/admin/ordersList" }, method = RequestMethod.GET)
	public ModelAndView categoriesListPage(ModelAndView model) throws IOException {
		model.addObject("ordersList", orderDAO.orderList());
		model.setViewName("ordersListPage");
		return model;
	}

	@RequestMapping(value = { "/admin/deleteOrder" }, method = RequestMethod.GET)
	public String lockClient(HttpServletRequest request) throws IOException {
		int orderID = Integer.parseInt(request.getParameter("orderID"));
		orderDAO.deleteOrder(orderID);
		return "redirect:/admin/ordersList";
	}

	@RequestMapping(value = "/client/busket", method = RequestMethod.GET)
	public ModelAndView busket(HttpServletRequest request, HttpSession session) {
		ModelAndView model = new ModelAndView("busket");
		model.addObject("newOrder", request.getSession().getAttribute("newOrder"));
		return model;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/client/busket/plus", method = RequestMethod.GET)
	public @ResponseBody
	ModelAndView plus(HttpServletRequest request, HttpSession session) {
		Order order = new Order();
		list = (ArrayList<Order>) request.getSession().getAttribute("newOrder");

		for (int i = 0; i < list.size(); i++) {
			if (Integer.valueOf(request.getParameter("orderGoodsID")) == (list.get(i).getOrderGoodsID())) {
				order.setOrderGoodsID(list.get(i).getOrderGoodsID());
				order.setOrderGoodsName(list.get(i).getOrderGoodsName());
				order.setOrderAmount(list.get(i).getOrderAmount() + 1);
				order.setOrderPrice(list.get(i).getOrderPrice());
				order.setDeliveryMeth(list.get(i).getDeliveryMeth());
				order.setPaymentMeth(list.get(i).getPaymentMeth());
				list.remove(i);
				list.add(i, order);
				break;
			}
		}
		session.setAttribute("newOrder", list);
		return new ModelAndView("redirect:/client/busket");
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/client/busket/minus", method = RequestMethod.GET)
	public @ResponseBody
	ModelAndView minus(HttpServletRequest request, HttpSession session) {
		Order order = new Order();
		list = (ArrayList<Order>) request.getSession().getAttribute("newOrder");

		for (int i = 0; i < list.size(); i++) {
			if (Integer.valueOf(request.getParameter("orderGoodsID")) == (list.get(i).getOrderGoodsID()) && list.get(i).getOrderAmount() > 1) {
				order.setOrderGoodsID(list.get(i).getOrderGoodsID());
				order.setOrderGoodsName(list.get(i).getOrderGoodsName());
				order.setOrderAmount(list.get(i).getOrderAmount() - 1);
				order.setOrderPrice(list.get(i).getOrderPrice());
				order.setDeliveryMeth(list.get(i).getDeliveryMeth());
				order.setPaymentMeth(list.get(i).getPaymentMeth());
				list.remove(i);
				list.add(i, order);
				break;
			}
		}
		session.setAttribute("newOrder", list);
		return new ModelAndView("redirect:/client/busket");
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/client/busket/buy", method = RequestMethod.GET)
	public @ResponseBody
	ModelAndView buy(HttpServletRequest request, HttpSession session) {
		Order order = new Order();
		list = (ArrayList<Order>) request.getSession().getAttribute("newOrder");

		for (int i = 0; i < list.size(); i++) {
			if (Integer.valueOf(request.getParameter("orderGoodsID")) == (list.get(i).getOrderGoodsID())) {
				order.setOrderGoodsID(list.get(i).getOrderGoodsID());
				order.setOrderClientID((Integer) request.getSession().getAttribute("clientID"));
				order.setOrderGoodsName(list.get(i).getOrderGoodsName());
				order.setOrderAmount(list.get(i).getOrderAmount());
				order.setOrderPrice(list.get(i).getOrderPrice());
				order.setDeliveryMeth(list.get(i).getDeliveryMeth());
				order.setPaymentMeth(list.get(i).getPaymentMeth());
				orderDAO.newOrder(order);
				list.remove(i);
				break;
			}
		}
		session.setAttribute("newOrder", list);
		return new ModelAndView("redirect:/client/busket");
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/client/busket/delete", method = RequestMethod.GET)
	public @ResponseBody
	ModelAndView delete(HttpServletRequest request, HttpSession session) {
		list = (ArrayList<Order>) request.getSession().getAttribute("newOrder");

		for (int i = 0; i < list.size(); i++) {
			if (Integer.valueOf(request.getParameter("orderGoodsID")) == (list.get(i).getOrderGoodsID())) {
				list.remove(i);
				break;
			}
		}
		session.setAttribute("newOrder", list);
		return new ModelAndView("redirect:/client/busket");
	}

}