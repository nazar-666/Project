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

	@Autowired
	public ProducerDAOImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public void newProducer(Producer producer) {
		String sql = "INSERT INTO producers(prod_name, prod_descr, prod_logo, prod_enable)VALUES(?,?,?, 'ENABLE')";
		this.getJdbcTemplate().update(sql, producer.getProducerName(), producer.getProducerDescr(), producer.getProducerLogo());
	}

	public void deleteProducer(int producerID) {
		String sql = "DELETE FROM producers WHERE prod_id=?";

		try {
			this.getJdbcTemplate().update(sql, producerID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public void disableProducer(int producerID) {
		String sql = "UPDATE producers SET prod_enable = 'DISABLE' WHERE prod_id = ?";
		try {
			this.getJdbcTemplate().update(sql, producerID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public void enableProducer(int producerID) {
		String sql = " UPDATE producers SET prod_enable = 'ENABLE' WHERE prod_id = ?";
		try {
			this.getJdbcTemplate().update(sql, producerID);
		} catch (EmptyResultDataAccessException e) {
			e.printStackTrace();
		}
	}

	public List<Producer> producerList() {
		String sql = "SELECT * FROM producers";
		try {
			List<Producer> producerList = this.getJdbcTemplate().query(sql, new RowMapper<Producer>() {

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
		String sql = "SELECT prod_name FROM producers";
		try {
			List<String> producerNameList = this.getJdbcTemplate().query(sql, new RowMapper<String>() {

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
		String sql = "SELECT prod_id FROM producers WHERE prod_name=?";
		try {
			return Integer.valueOf(this.getJdbcTemplate().queryForObject(sql, new Object[] { producerName }, String.class));
		} catch (EmptyResultDataAccessException e) {
			return -1;
		}
	}

	public Producer getProducerInfo(int producerID) {
		String sql = "SELECT * FROM producers WHERE prod_id = " + producerID;
		return this.getJdbcTemplate().query(sql, new ResultSetExtractor<Producer>() {

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
		String sql = "UPDATE producers SET prod_name=?, prod_descr=?, prod_logo=?, prod_enable='ENABLE' WHERE prod_id =?";
		this.getJdbcTemplate().update(sql, producer.getProducerName(), producer.getProducerDescr(), producer.getProducerLogo(), producer.getProducerID());
	}
}
