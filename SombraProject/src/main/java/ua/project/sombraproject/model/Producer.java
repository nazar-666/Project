package ua.project.sombraproject.model;

import java.io.Serializable;

public class Producer implements Serializable {
	private static final long serialVersionUID = 8611954479229453350L;

	private int producerID;
	private String producerName;
	private String producerDescr;
	private String producerLogo;
	private String producerEnable;

	public Producer() {
	}

	public Producer(int producerID, String producerName, String producerDescr, String producerLogo, String producerEnable) {
		this.producerName = producerName;
		this.producerDescr = producerDescr;
		this.producerLogo = producerLogo;
		this.producerID = producerID;
		this.producerEnable = producerEnable;
	}

	public int getProducerID() {
		return producerID;
	}

	public void setProducerID(int producerID) {
		this.producerID = producerID;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public String getProducerDescr() {
		return producerDescr;
	}

	public void setProducerDescr(String producerDescr) {
		this.producerDescr = producerDescr;
	}

	public String getProducerLogo() {
		return producerLogo;
	}

	public void setProducerLogo(String producerLogo) {
		this.producerLogo = producerLogo;
	}

	public String getProducerEnable() {
		return producerEnable;
	}

	public void setProducerEnable(String producerEnable) {
		this.producerEnable = producerEnable;
	}

}
