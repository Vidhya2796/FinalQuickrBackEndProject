package com.quickr.productapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ProductAppService {

	@Autowired
	private RestTemplate restTemplate;
	
	/*@HystrixCommand(fallbackMethod = "unknown")
	public String addProduct() {
		return restTemplate.getForEntity("http://service/add", 
				String.class)
				.getBody();
	}*/
	
	
	@HystrixCommand(fallbackMethod = "unknown")
	public String addProduct() {
		return restTemplate.getForEntity("http://service/add", 
				String.class)
				.getBody();
	}
	
	public String unknown() {
		return "unknown vidhya";
	}
	
}
