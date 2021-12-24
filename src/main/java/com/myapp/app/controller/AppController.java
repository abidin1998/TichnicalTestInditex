package com.myapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.app.bean.ProductsResponse;
import com.myapp.app.service.AppProductsServiceImpl;

/**
 * The AppController
 *
 */
@RestController
public class AppController {

	/**
	 * The appProductsServiceImpl
	 */
	private AppProductsServiceImpl appProductsServiceImpl;

	/**
	 * The AppController
	 * 
	 * @param appProductsServiceImpl
	 * 			The appProductsServiceImpl
	 */
	@Autowired
	public AppController(AppProductsServiceImpl appProductsServiceImpl) {
		super();
		this.appProductsServiceImpl = appProductsServiceImpl;
	}

	/**
	 * The getSimilarProducts
	 * 
	 * @param productId
	 * 			The productId
	 * @return ProductsResponse
	 */
	@GetMapping("/product/{productId}/similar")
	public ResponseEntity<ProductsResponse> getSimilarProducts(@PathVariable(value = "productId") String productId) {
		return ResponseEntity.ok(appProductsServiceImpl.getproducts(productId));
	}

}
