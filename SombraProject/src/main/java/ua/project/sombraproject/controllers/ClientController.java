package ua.project.sombraproject.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ua.project.sombraproject.dao.CategoryDAO;
import ua.project.sombraproject.dao.ClientDAO;
import ua.project.sombraproject.model.Client;

@Controller
public class ClientController {

	@Autowired
	private ClientDAO clientDAO;

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public @ResponseBody
	Client saveClient(HttpServletRequest request) throws Exception {
		Client client = new Client();
		LocalDate localDate = LocalDate.parse(request.getParameter("clientDate"));

		client.setLogin(request.getParameter("login"));
		client.setClientName(request.getParameter("clientName"));
		client.setClientSurname(request.getParameter("clientSurname"));
		client.setClientDate(localDate.getYear() + "-" + localDate.getMonthValue() + "-" + localDate.getDayOfMonth());
		client.setClientEmail(request.getParameter("clientEmail"));
		client.setPassword(request.getParameter("password"));

		try (Connection con = daoFactory.getConnection()) {
			daoFactory.getClientDAO(con).newClient(client);
		}
		return client;
	}

	@RequestMapping(value = { "/admin" }, method = RequestMethod.GET)
	public ModelAndView clientsListPage(ModelAndView model) throws IOException {
		model.addObject("clientList", clientDAO.clientList());
		model.setViewName("adminPage");
		return model;
	}

	@RequestMapping(value = { "/client" }, method = RequestMethod.GET)
	public ModelAndView clientPage(ModelAndView model) throws IOException {
		model.addObject("categoryList", categoryDAO.categoryList());
		model.setViewName("clientPage");
		return model;
	}

	@RequestMapping(value = { "/admin/lockClient" }, method = RequestMethod.GET)
	public String lockClient(HttpServletRequest request) throws IOException {
		int clientID = Integer.parseInt(request.getParameter("clientID"));
		clientDAO.disableClient(clientID);
		return "redirect:/admin";
	}

	@RequestMapping(value = { "/admin/unblockClient" }, method = RequestMethod.GET)
	public String unblockClient(HttpServletRequest request) throws IOException {
		int clientID = Integer.parseInt(request.getParameter("clientID"));
		clientDAO.enableClient(clientID);
		return "redirect:/admin";
	}
}
