package com.myapp.app.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * The SimilarProductsList
 *
 */
public class SimilarProductsList {

	private ArrayList<Integer> similarProducts;

	public SimilarProductsList(ArrayList<Integer> similarProducts) {
		super();
		this.similarProducts = similarProducts;
	}


	public SimilarProductsList() {
		super();
	}


	public List<Integer> getSimilarProducts() {
		return similarProducts;
	}


	public void setSimilarProducts(ArrayList<Integer> similarProducts) {
		this.similarProducts = similarProducts;
	}
	
	
}
