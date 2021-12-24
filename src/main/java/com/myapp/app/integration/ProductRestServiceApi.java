package com.myapp.app.integration;

import com.myapp.app.bean.Products;

/**
 * The ProductRestServiceApi
 *
 */
public interface ProductRestServiceApi {

	/**
	 * getSimilarProducts
	 * 
	 * @param id
	 * 			The id
	 * @return Integer
	 */
	Integer[] getSimilarProducts(String id);
	
	/**
	 * getProducts
	 * 
	 * @param id
	 * 			The id
	 * @return Products
	 */
	Products getProducts(String id);
}
