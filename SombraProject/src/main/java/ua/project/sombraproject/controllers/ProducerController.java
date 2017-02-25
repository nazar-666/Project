package ua.project.sombraproject.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ua.project.sombraproject.dao.ProducerDAO;
import ua.project.sombraproject.model.Producer;

@Controller
public class ProducerController {

	@Autowired
	private ProducerDAO producerDAO;

	@RequestMapping(value = { "/admin/producersList" }, method = RequestMethod.GET)
	public ModelAndView producersListPage(ModelAndView model) throws IOException {
		model.addObject("producersList", producerDAO.producerList());
		model.setViewName("producersListPage");
		return model;
	}

	@RequestMapping(value = "/admin/addProducer", method = RequestMethod.POST)
	public @ResponseBody
	Producer newProducer(HttpServletRequest request) throws Exception {
		Producer producer = new Producer();

		producer.setProducerName(request.getParameter("producerName"));
		producer.setProducerDescr(request.getParameter("producerDescr"));
		producer.setProducerLogo(request.getParameter("producerLogo"));
		producer.setProducerEnable(request.getParameter("producerEnable"));

		producerDAO.newProducer(producer);
		return producer;
	}

	@RequestMapping(value = "/admin/deleteProducer", method = RequestMethod.GET)
	public ModelAndView deleteProducer(HttpServletRequest request) {
		producerDAO.deleteProducer(Integer.parseInt(request.getParameter("producerID")));
		return new ModelAndView("redirect:/admin");
	}

	@RequestMapping(value = "/admin/editingProducer", method = RequestMethod.GET)
	public ModelAndView editProducerPage(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("editProducerPage");
		model.addObject("editProducer", producerDAO.getProducerInfo(Integer.parseInt(request.getParameter("producerID"))));
		return model;
	}

	@RequestMapping(value = "/admin/editProducer", method = RequestMethod.POST)
	public @ResponseBody
	Producer editProducer(HttpServletRequest request) {
		Producer producer = new Producer();

		producer.setProducerID(Integer.parseInt(request.getParameter("producerID")));
		producer.setProducerName(request.getParameter("producerName"));
		producer.setProducerDescr(request.getParameter("producerDescr"));
		producer.setProducerLogo(request.getParameter("producerLogo"));

		producerDAO.editProducer(producer);
		return producer;
	}
}
