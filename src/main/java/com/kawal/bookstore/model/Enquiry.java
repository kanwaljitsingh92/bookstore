package com.kawal.bookstore.model;

public class Enquiry {

	public String searchString;
	
	public Enquiry() {
	
	}

	public Enquiry(String searchString) {
		
		this.searchString = searchString;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	
	
}
