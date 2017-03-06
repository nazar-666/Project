package ua.project.sombraproject.model;

import java.io.Serializable;

public class Client implements Serializable {
	private static final long serialVersionUID = -7499802200694021037L;

	private int clientID;
	private String login;
	private String password;
	private String role;
	private String clientEnable;
	private String clientName;
	private String clientSurname;
	private String clientDate;
	private String clientEmail;

	public Client() {
	}

	public Client(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public Client(int clientID, String login, String password, String role, String clientEnable, String clientName, String clientSurname, String clientDate, String clientEmail) {
		this();
		this.clientID = clientID;
		this.role = role;
		this.clientEnable = clientEnable;
		this.clientName = clientName;
		this.clientSurname = clientSurname;
		this.clientDate = clientDate;
		this.clientEmail = clientEmail;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getClientEnable() {
		return clientEnable;
	}

	public void setClientEnable(String clientEnable) {
		this.clientEnable = clientEnable;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientSurname() {
		return clientSurname;
	}

	public void setClientSurname(String clientSurname) {
		this.clientSurname = clientSurname;
	}

	public String getClientDate() {
		return clientDate;
	}

	public void setClientDate(String clientDate) {
		this.clientDate = clientDate;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
}