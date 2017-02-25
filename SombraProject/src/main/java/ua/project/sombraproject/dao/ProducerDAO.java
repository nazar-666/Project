package ua.project.sombraproject.dao;

import java.util.List;

import ua.project.sombraproject.model.Producer;

public interface ProducerDAO {

	public void newProducer(Producer producer);

	public void deleteProducer(int producerID);

	public void editProducer(Producer producer);

	public Producer getProducerInfo(int producerID);

	public int getProducerID(String producerName);

	public List<Producer> producerList();

	public List<String> producerNameList();

}