package ua.project.sombraproject.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.project.sombraproject.dao.ProducerDAO;
import ua.project.sombraproject.model.Producer;

@Service
@Transactional
public class ProducerDAOImpl extends JdbcDaoSupport implements ProducerDAO {
	final String DISABLE = "DISABLE";
	final String ENABLE = "ENABLE";
	final String INSERT_PRODUCER = "INSERT INTO producers(prod_name, prod_descr, prod_logo, prod_enable)VALUES(?,?,?, '" + ENABLE + "')";
	final String DELETE_PRODUCER = "DELETE FROM producers WHERE prod_id=?";
	final String DISABLE_PRODUCER = "UPDATE producers SET prod_enable = '" + DISABLE + "' WHERE prod_id = ?";
	final String ENABLE_PRODUCER = "UPDATE producers SET prod_enable = '" + ENABLE + "' WHERE prod_id = ?";
	final String SELECT_ALL_PRODUCERS = "SELECT * FROM producers";
	final String SELECT_PRODUCER_NAME = "SELECT prod_name FROM producers";
	final String SELECT_PRODUCER_ID = "SELECT prod_id FROM producers WHERE prod_name=?";
	final String SELECT_PRODUCER = "SELECT * FROM producers WHERE prod_id=";
	final String EDIT_PRODUCER = "UPDATE producers SET prod_name=?, prod_descr=?, prod_logo=?, prod_enable='" + ENABLE + "' WHERE prod_id=?";

	@Autowired
	public ProducerDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public void newProducer(Producer producer) {
		this.getJdbcTemplate().update(INSERT_PRODUCER, producer.getProducerName(), producer.getProducerDescr(), producer.getProducerLogo());
	}

	public void deleteProducer(int producerID) {
		try {
			this.getJdbcTemplate().update(DELETE_PRODUCER, producerID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public void disableProducer(int producerID) {
		try {
			this.getJdbcTemplate().update(DISABLE_PRODUCER, producerID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public void enableProducer(int producerID) {
		try {
			this.getJdbcTemplate().update(ENABLE_PRODUCER, producerID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public List<Producer> producerList() {
		try {
			List<Producer> producerList = this.getJdbcTemplate().query(SELECT_ALL_PRODUCERS, new RowMapper<Producer>() {

				public Producer mapRow(ResultSet rs, int rowNum) throws SQLException {
					Producer producerList = new Producer();

					producerList.setProducerID(rs.getInt("prod_id"));
					producerList.setProducerName(rs.getString("prod_name"));
					producerList.setProducerDescr(rs.getString("prod_descr"));
					producerList.setProducerLogo(rs.getString("prod_logo"));
					producerList.setProducerEnable(rs.getString("prod_enable"));

					return producerList;
				}
			});
			return producerList;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public List<String> producerNameList() {
		try {
			List<String> producerNameList = this.getJdbcTemplate().query(SELECT_PRODUCER_NAME, new RowMapper<String>() {

				public String mapRow(ResultSet rs, int rowNum) throws SQLException {
					Producer producerNameList = new Producer();
					producerNameList.setProducerName(rs.getString("prod_name"));

					return producerNameList.getProducerName();
				}
			});
			return producerNameList;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public int getProducerID(String producerName) {
		try {
			return Integer.valueOf(this.getJdbcTemplate().queryForObject(SELECT_PRODUCER_ID, new Object[] { producerName }, String.class));
		} catch (EmptyResultDataAccessException e) {
			return -1;
		}
	}

	public Producer getProducerInfo(int producerID) {
		return this.getJdbcTemplate().query(SELECT_PRODUCER + producerID, new ResultSetExtractor<Producer>() {

			public Producer extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Producer producer = new Producer();
					producer.setProducerID(rs.getInt("prod_id"));
					producer.setProducerName(rs.getString("prod_name"));
					producer.setProducerDescr(rs.getString("prod_descr"));
					producer.setProducerLogo(rs.getString("prod_logo"));
					return producer;
				}
				return null;
			}
		});
	}

	public void editProducer(Producer producer) {
		this.getJdbcTemplate().update(EDIT_PRODUCER, producer.getProducerName(), producer.getProducerDescr(), producer.getProducerLogo(), producer.getProducerID());
	}
}
