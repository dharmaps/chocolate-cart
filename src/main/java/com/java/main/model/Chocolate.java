
package com.java.main.model;

import java.util.UUID;

public class Chocolate {
	private String id;
	private Double rating;
	private String reviewDate;
	private String name;
	private Double cocoaPercent;
	private String company;
	private String companyLocation;
	private String broadBeanOrigin;
	private String ref;

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(String reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCocoaPercent() {
		return cocoaPercent;
	}

	public void setCocoaPercent(double d) {
		this.cocoaPercent = d;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public String getBroadBeanOrigin() {
		return broadBeanOrigin;
	}

	public void setBroadBeanOrigin(String broadBeanOrigin) {
		this.broadBeanOrigin = broadBeanOrigin;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCocoaPercent(Double cocoaPercent) {
		this.cocoaPercent = cocoaPercent;
	}

}