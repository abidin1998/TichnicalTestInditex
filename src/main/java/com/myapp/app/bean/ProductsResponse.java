package com.myapp.app.bean;

import java.util.List;

/**
 * The ProductsResponse
 *
 */
public class ProductsResponse {

	private List<Products> similarProductsList;

	public ProductsResponse(List<Products> similarProductsList) {
		super();
		this.similarProductsList = similarProductsList;
	}

	public ProductsResponse() {
		super();
	}

	public List<Products> getSimilarProductsList() {
		return similarProductsList;
	}

	public void setSimilarProductsList(List<Products> similarProductsList) {
		this.similarProductsList = similarProductsList;
	}
	
	
}
