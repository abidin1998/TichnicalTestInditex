package com.myapp.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.app.bean.Products;
import com.myapp.app.bean.ProductsResponse;
import com.myapp.app.integration.ProductRestServiceApi;

/**
 * The AppProductsServiceImpl
 *
 */
@Service
public class AppProductsServiceImpl implements AppProductsService {

	/**
	 * The productRestServiceApi
	 */
	private ProductRestServiceApi productRestServiceApi;
	
	
	/**
	 * @param productRestServiceApi
	 * 			The productRestServiceApi
	 */
	@Autowired
	public AppProductsServiceImpl(ProductRestServiceApi productRestServiceApi) {
		super();
		this.productRestServiceApi = productRestServiceApi;
	}


	/**
	 * The getproducts
	 * 
	 * @param id
	 * 		The id
	 * @return ProductsResponse
	 */
	@Override
	public ProductsResponse getproducts(String id) {
		ProductsResponse response = new ProductsResponse();
		List<Products> productsList = new ArrayList<>();
		Integer[] similarProductsList =productRestServiceApi.getSimilarProducts(id);
		for(int i=0;i<similarProductsList.length;i++) {
			productsList.add(productRestServiceApi.getProducts(String.valueOf(similarProductsList[i])));
		}
		response.setSimilarProductsList(productsList );
		return response;
	}

}
