package ua.project.sombraproject.controllers;

import java.io.IOException;
import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.project.sombraproject.dao.ClientDAO;

@Controller
public class TransitionalController {

	@Autowired
	private ClientDAO clientDAO;

	@RequestMapping(value = { "/", "/welcome" }, method = RequestMethod.GET)
	public String welcomePage(Model model) {
		return "welcomePage";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		return "loginPage";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public void logoutPage(Model model, HttpSession session) {
		session.invalidate();
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registrationPage(Model model) {
		return "registrationPage";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String permisionPage(Model model) {
		return "permisionPage";
	}

	@RequestMapping(value = "/temp", method = RequestMethod.GET)
	public String userInfo(SecurityContextHolderAwareRequestWrapper request, HttpSession session, Principal principal) throws IOException {
		session.setAttribute("clientID", clientDAO.getClientID(principal.getName()));
		if (request.isUserInRole("ROLE_ADMIN")) {
			return "redirect:/admin";
		} else {
			return "redirect:/client";
		}
	}
}
