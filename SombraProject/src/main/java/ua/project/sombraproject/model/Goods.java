package ua.project.sombraproject.model;

public class Goods {
	private int goodsID;
	private int goodsCategoryID;
	private int goodsProducerID;
	private String goodsName;
	private String goodsDescr;
	private double goodsPrice;
	private String goodsAvail;
	private String goodsFirstImg;
	private String goodsSecondImg;
	private String goodsThirdImg;

	public Goods() {
	}

	public Goods(int goodsID, int goodsCategoryID, int goodsProducerID, String goodsName, double goodsPrice, String goodsDescr, String goodsAvail, String goodsFirstImg, String goodsSecondImg, String goodsThirdImg) {
		this.goodsID = goodsID;
		this.goodsCategoryID = goodsCategoryID;
		this.goodsProducerID = goodsProducerID;
		this.goodsName = goodsName;
		this.goodsDescr = goodsDescr;
		this.goodsPrice = goodsPrice;
		this.goodsAvail = goodsAvail;
		this.goodsFirstImg = goodsFirstImg;
		this.goodsSecondImg = goodsSecondImg;
		this.goodsThirdImg = goodsThirdImg;
	}

	public int getGoodsID() {
		return goodsID;
	}

	public void setGoodsID(int goodsID) {
		this.goodsID = goodsID;
	}

	public int getGoodsCategoryID() {
		return goodsCategoryID;
	}

	public void setGoodsCategoryID(int goodsCategoryID) {
		this.goodsCategoryID = goodsCategoryID;
	}

	public int getGoodsProducerID() {
		return goodsProducerID;
	}

	public void setGoodsProducerID(int goodsProducerID) {
		this.goodsProducerID = goodsProducerID;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsDescr() {
		return goodsDescr;
	}

	public void setGoodsDescr(String goodsDescr) {
		this.goodsDescr = goodsDescr;
	}

	public double getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public String getGoodsAvail() {
		return goodsAvail;
	}

	public void setGoodsAvail(String goodsAvail) {
		this.goodsAvail = goodsAvail;
	}

	public String getGoodsFirstImg() {
		return goodsFirstImg;
	}

	public void setGoodsFirstImg(String goodsImg) {
		this.goodsFirstImg = goodsImg;
	}

	public String getGoodsSecondImg() {
		return goodsSecondImg;
	}

	public void setGoodsSecondImg(String goodsSecondImg) {
		this.goodsSecondImg = goodsSecondImg;
	}

	public String getGoodsThirdImg() {
		return goodsThirdImg;
	}

	public void setGoodsThirdImg(String goodsThirdImg) {
		this.goodsThirdImg = goodsThirdImg;
	}
}
