package ua.project.sombraproject.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ua.project.sombraproject.model.Client;

public class ClientMapper implements RowMapper<Client> {

	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {

		return new Client(rs.getString("client_login"), rs.getString("client_pass"));
	}

}