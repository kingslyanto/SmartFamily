package com.ke.family.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ke.family.model.BooksModel;
import com.ke.family.service.APIService;

@Service
public class APIServiceImpl implements APIService {

	@Autowired
	RestTemplate restTemplate;
	
	String url="";
	
	public String get() {
		 url = "http://localhost:8080/books/get";
		return restTemplate.getForObject(url, String.class);
	}
	
	public BooksModel bookDetails (int id) {
		url =  "http://localhost:8080/books/get/"+id;
		return restTemplate.getForObject(url, BooksModel.class);
	}
}
