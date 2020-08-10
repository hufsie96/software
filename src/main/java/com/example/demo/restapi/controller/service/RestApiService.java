package com.example.demo.restapi.controller.service;

import org.springframework.stereotype.Service;

@Service
public interface RestApiService {
	
	public String getUserId();
	
	public void setUserId(String userId);

}
