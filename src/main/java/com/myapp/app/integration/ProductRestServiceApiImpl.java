package com.myapp.app.integration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.myapp.app.bean.Products;

/**
 * The ProductRestServiceApiImpl
 *
 */
@Service
public class ProductRestServiceApiImpl implements ProductRestServiceApi {

	RestTemplate restTemplate = new RestTemplate();

	@Value("${rest.productsurl}")
	private String productsurl;

	@Value("${rest.similarProductsurl}")
	private String similarProductsurl;

	/**
	 * getSimilarProducts
	 * 
	 * @param id
	 * 			The id
	 * @return Integer
	 */
	@Override
	public Products getProducts(String id) {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<String> entity = new HttpEntity<String>(headers);
			UriComponentsBuilder urlBuilder = UriComponentsBuilder.fromUriString(productsurl);
			Map<String, String> tmpMap = new HashMap<>();
			tmpMap.put("id", id);
			ResponseEntity<Products> response = restTemplate.exchange(
					urlBuilder.buildAndExpand(tmpMap).encode().toUriString(), HttpMethod.GET, entity, Products.class);

			return response.getBody();
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * getProducts
	 * 
	 * @param id
	 * 			The id
	 * @return Products
	 */
	@Override
	public Integer[] getSimilarProducts(String id) {
		try {
		HttpHeaders headers = new HttpHeaders();
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		UriComponentsBuilder urlBuilder = UriComponentsBuilder.fromUriString(similarProductsurl);
		Map<String, String> tmpMap = new HashMap<>();
		tmpMap.put("id", id);
		ResponseEntity<Integer[]> response = restTemplate.exchange(
				urlBuilder.buildAndExpand(tmpMap).encode().toUriString(), HttpMethod.GET, entity, Integer[].class);

		return response.getBody();
		}catch(RestClientException e){
			throw e;
		}
	}

}
