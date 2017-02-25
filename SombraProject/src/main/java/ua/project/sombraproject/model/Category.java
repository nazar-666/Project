package ua.project.sombraproject.model;

public class Category {
	private int categoryID;
	private String categoryName;
	private String categoryDescr;
	private String categoryImg;

	public Category() {
	}

	public Category(String categoryName, String categoryDescr, String categoryImg) {
		this.categoryName = categoryName;
		this.categoryDescr = categoryDescr;
		this.categoryImg = categoryImg;
	}

	public Category(int categoryID, String categoryName, String categoryDescr, String categoryImg) {
		this(categoryName, categoryDescr, categoryImg);
		this.categoryID = categoryID;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescr() {
		return categoryDescr;
	}

	public void setCategoryDescr(String categoryDescr) {
		this.categoryDescr = categoryDescr;
	}

	public String getCategoryImg() {
		return categoryImg;
	}

	public void setCategoryImg(String categoryImg) {
		this.categoryImg = categoryImg;
	}
}
