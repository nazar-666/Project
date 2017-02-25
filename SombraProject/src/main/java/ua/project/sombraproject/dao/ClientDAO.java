package ua.project.sombraproject.dao;

import java.util.List;

import ua.project.sombraproject.model.Client;

public interface ClientDAO {

	// for login and authentication
	public Client checkClient(String login);

	public List<String> getClientRoles(String login);

	// for work with users information
	public int getClientID(String clientName);

	public void newClient(Client client);

	public void disableClient(int clientID);

	public void enableClient(int clientID);

	public List<Client> clientList();

}