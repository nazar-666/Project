package ua.project.sombraproject.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ua.project.sombraproject.dao.CategoryDAO;
import ua.project.sombraproject.dao.GoodsDAO;
import ua.project.sombraproject.dao.ProducerDAO;
import ua.project.sombraproject.model.Goods;
import ua.project.sombraproject.model.Order;

@Controller
public class GoodsController {

	private List<Order> list = new ArrayList<Order>();
	@Autowired
	private GoodsDAO goodsDAO;
	@Autowired
	private ProducerDAO producerDAO;
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/admin/goodsList" }, method = RequestMethod.GET)
	public ModelAndView goodsListPage(ModelAndView model) throws IOException {
		model.addObject("goodsList", goodsDAO.allGoodsList());
		model.setViewName("goodsListPage");
		return model;
	}

	@RequestMapping(value = "/admin/addGoods", method = RequestMethod.POST)
	public @ResponseBody
	Goods newGoods(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Goods goods = new Goods();

		goods.setGoodsCategoryID(categoryDAO.getCategoryID(request.getParameter("goodsCategoryName")));
		goods.setGoodsProducerID(producerDAO.getProducerID(request.getParameter("goodsProducerName")));
		goods.setGoodsName(request.getParameter("goodsName"));
		goods.setGoodsDescr(request.getParameter("goodsDescr"));
		goods.setGoodsPrice(Double.valueOf(request.getParameter("goodsPrice")));
		goods.setGoodsFirstImg(request.getParameter("goodsFirstImg"));
		goods.setGoodsSecondImg(request.getParameter("goodsSecondImg"));
		goods.setGoodsThirdImg(request.getParameter("goodsThirdImg"));

		goodsDAO.newGoods(goods);
		return goods;
	}

	@RequestMapping(value = "/admin/editingGoods", method = RequestMethod.GET)
	public ModelAndView editGoodsPage(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("editGoodsPage");
		model.addObject("categoryNameList", categoryDAO.categoryNameList());
		model.addObject("producerNameList", producerDAO.producerNameList());
		model.addObject("editGoods", goodsDAO.getGoodsByID(Integer.parseInt(request.getParameter("goodsID"))));
		return model;
	}

	@RequestMapping(value = "/admin/updateGoods", method = RequestMethod.POST)
	public @ResponseBody
	Goods updateGoods(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Goods goods = new Goods();

		int categoryID = categoryDAO.getCategoryID(request.getParameter("goodsCategoryName"));
		int producerID = producerDAO.getProducerID(request.getParameter("goodsProducerName"));

		goods.setGoodsID(Integer.valueOf(request.getParameter("goodsID")));
		goods.setGoodsCategoryID(categoryID);
		goods.setGoodsProducerID(producerID);
		goods.setGoodsName(request.getParameter("goodsName"));
		goods.setGoodsDescr(request.getParameter("goodsDescr"));
		goods.setGoodsPrice(Double.valueOf(request.getParameter("goodsPrice")));
		goods.setGoodsFirstImg(request.getParameter("goodsFirstImg"));
		goods.setGoodsSecondImg(request.getParameter("goodsSecondImg"));
		goods.setGoodsThirdImg(request.getParameter("goodsThirdImg"));

		goodsDAO.updateGoods(goods);
		return goods;
	}

	@RequestMapping(value = "/admin/deleteGoods", method = RequestMethod.GET)
	public ModelAndView deleteGoods(HttpServletRequest request) {
		goodsDAO.deleteGoods(Integer.parseInt(request.getParameter("goodsID")));
		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping(value = "/client/choosedCategory", method = RequestMethod.GET)
	public ModelAndView filterGoodsByCategory(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("allGoodsForCategoryPage");
		model.addObject("choosedCategory", goodsDAO.filterByCategory(Integer.parseInt(request.getParameter("categoryID"))));
		return model;
	}

	@RequestMapping(value = "/client/choosedCategory/choosedGoods", method = RequestMethod.GET)
	public ModelAndView choosedGoods(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("goodsPage");
		Goods goods = goodsDAO.getGoodsByID(Integer.parseInt(request.getParameter("goodsID")));
		model.addObject("choosedGoods", goods);
		model.addObject("producerInfo", producerDAO.getProducerInfo(goods.getGoodsProducerID()));
		return model;
	}

	@RequestMapping(value = "/client/buyGoods", method = RequestMethod.GET)
	public @ResponseBody
	ModelAndView buyGoods(HttpServletRequest request, HttpSession session) {
		Order order = new Order();
		boolean check = false;

		order.setOrderClientID((Integer) request.getSession().getAttribute("clientID"));
		order.setOrderGoodsID(Integer.parseInt(request.getParameter("goodsID")));
		order.setOrderGoodsName(goodsDAO.getGoodsByID(Integer.parseInt(request.getParameter("goodsID"))).getGoodsName());
		order.setOrderAmount(1);
		order.setOrderPrice(goodsDAO.getGoodsByID(Integer.parseInt(request.getParameter("goodsID"))).getGoodsPrice());
		order.setDeliveryMeth("Delivery Method");
		order.setPaymentMeth("Payment Method");
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getOrderGoodsID()) == order.getOrderGoodsID()) {
				list.get(i).setOrderAmount(list.get(i).getOrderAmount() + 1);
				check = true;
				break;
			}
		}
		if (!check) {
			list.add(order);
		}
		session.setAttribute("newOrder", list);
		return new ModelAndView("redirect:/client/choosedCategory/choosedGoods?goodsID=" + request.getParameter("goodsID"));
	}

	@RequestMapping(value = "/admin/control", method = RequestMethod.GET)
	public ModelAndView controlPage(ModelAndView model) {
		model.addObject("categoryNameList", categoryDAO.categoryNameList());
		model.addObject("producerNameList", producerDAO.producerNameList());
		model.setViewName("controlPage");

		return model;
	}
}