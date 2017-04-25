package com.java.main.model;

public class Fields {

	private Double rating;
	private String review_date;
	private String name;
	private Integer cocoa_percent;
	private String company;
	private String company_location;
	private String broad_bean_origin;
	private String ref;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Fields() {
	}

	/**
	 * 
	 * @param ref
	 * @param broadBeanOrigin
	 * @param cocoaPercent
	 * @param company
	 * @param name
	 * @param reviewDate
	 * @param companyLocation
	 * @param rating
	 */
	public Fields(Double rating, String reviewDate, String name, Integer cocoaPercent, String company,
			String companyLocation, String broadBeanOrigin, String ref) {
		super();
		this.rating = rating;
		this.review_date = reviewDate;
		this.name = name;
		this.cocoa_percent = cocoaPercent;
		this.company = company;
		this.company_location = companyLocation;
		this.broad_bean_origin = broadBeanOrigin;
		this.ref = ref;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getReviewDate() {
		return review_date;
	}

	public void setReviewDate(String reviewDate) {
		this.review_date = reviewDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCocoaPercent() {
		return cocoa_percent;
	}

	public void setCocoaPercent(Integer cocoaPercent) {
		this.cocoa_percent = cocoaPercent;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyLocation() {
		return company_location;
	}

	public void setCompanyLocation(String companyLocation) {
		this.company_location = companyLocation;
	}

	public String getBroadBeanOrigin() {
		return broad_bean_origin;
	}

	public void setBroadBeanOrigin(String broadBeanOrigin) {
		this.broad_bean_origin = broadBeanOrigin;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

}