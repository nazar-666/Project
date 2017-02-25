package ua.project.sombraproject.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.project.sombraproject.dao.ClientDAO;
import ua.project.sombraproject.mapper.ClientMapper;
import ua.project.sombraproject.model.Client;

@Service
@Transactional
public class ClientDAOImpl extends JdbcDaoSupport implements ClientDAO {

	@Autowired
	public ClientDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public Client checkClient(String login) {
		String sql = "SELECT cp.client_login, cp.client_pass " + "FROM clients cp WHERE cp.client_enable = 'ENABLE' AND cp.client_login = ? ";

		Object[] params = new Object[] { login };
		ClientMapper mapper = new ClientMapper();
		try {
			Client userInfo = this.getJdbcTemplate().queryForObject(sql, params, mapper);
			return userInfo;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public List<String> getClientRoles(String login) {
		String sql = "Select client_role "//
				+ "FROM clients WHERE client_enable = 'ENABLE' AND client_login = ? ";

		Object[] params = new Object[] { login };

		List<String> roles = this.getJdbcTemplate().queryForList(sql, params, String.class);

		return roles;
	}

	public List<Client> clientList() {
		String sql = "SELECT * FROM clients";
		try {
			List<Client> clientList = this.getJdbcTemplate().query(sql, new RowMapper<Client>() {

				public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
					Client clientList = new Client();

					clientList.setClientID(rs.getInt("client_id"));
					clientList.setLogin(rs.getString("client_login"));
					clientList.setClientName(rs.getString("client_name"));
					clientList.setClientSurname(rs.getString("client_sur"));
					clientList.setClientDate(rs.getString("client_age"));
					clientList.setClientEmail(rs.getString("client_email"));
					clientList.setRole(rs.getString("client_role"));
					clientList.setClientEnable(rs.getString("client_enable"));
					return clientList;
				}
			});
			return clientList;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public void newClient(Client client) {
		String sql = "INSERT INTO clients(client_login, client_pass, client_role, client_enable, client_name, client_sur, client_age, client_email)VALUES(?,?,'USER','ENABLE',?,?,?,?)";
		this.getJdbcTemplate().update(sql, client.getLogin(), client.getPassword(), client.getClientName(), client.getClientSurname(), client.getClientDate(), client.getClientEmail());
	}

	public void deleteClient(int clientID) {
	}

	public void disableClient(int clientID) {
		String sql = " UPDATE clients SET client_enable = 'DISABLE' WHERE client_id = ?";
		try {
			this.getJdbcTemplate().update(sql, clientID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public void enableClient(int clientID) {
		String sql = " UPDATE clients SET client_enable = 'ENABLE' WHERE client_id = ?";
		try {
			this.getJdbcTemplate().update(sql, clientID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public int getClientID(String clientName) {
		String sql = "SELECT client_id FROM clients WHERE client_login=?";
		try {
			return Integer.valueOf(this.getJdbcTemplate().queryForObject(sql, new Object[] { clientName }, String.class));
		} catch (EmptyResultDataAccessException e) {
			return -1;
		}
	}
}
