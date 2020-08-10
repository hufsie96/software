package com.example.demo.restapi.controller.service.Impl;

import org.springframework.stereotype.Service;

import com.example.demo.restapi.controller.service.RestApiService;

@Service("restApiService")
public class RestApiServiceImpl implements RestApiService {
	
	private String userId = "";
	
	@Override
	public String getUserId() {
		return userId; 
	}
	
	@Override
	public void setUserId(String userId) {
		
		this.userId = userId;
		
	}
}
