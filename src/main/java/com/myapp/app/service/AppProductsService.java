package com.myapp.app.service;

import com.myapp.app.bean.ProductsResponse;

/**
 * The AppProductsService
 *
 */
public interface AppProductsService {

	/**
	 * The getproducts
	 * 
	 * @param id
	 * 		The id
	 * @return ProductsResponse
	 */
	ProductsResponse getproducts(String id);
}
