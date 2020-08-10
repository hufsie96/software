package com.example.demo.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.restapi.controller.service.RestApiService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/rest")
public class RestApiController {
	
	//@Autowired
	private RestApiService restApiService;
	
	private String API_ID = "";
	
	/* JUnit Test시 restApiService에대하여 Autowired가 안되므로 생성자를 이용하여
	 * restApiService를 생성해준다.	   
	*/
	public RestApiController (RestApiService restApiService) {
		
		this.restApiService = restApiService;
	}	
		
	@RequestMapping(method=RequestMethod.GET, value="/api01")
	public String getRestApi01(String userName) {
		this.API_ID = "restApi01"; 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info(restApiService.toString());
		
		return this.API_ID + ":" + userName;
	}	
	
	@RequestMapping(method=RequestMethod.GET, value="/api02")
	public String getRestApi02(String userName) {
		API_ID = "restApi02";
		
		log.info(restApiService.toString());
		
		return this.API_ID + ":" + userName;
	}	
	
	@RequestMapping(method=RequestMethod.GET, value="/api03")
	public String getRestApi03(String userName) {
		restApiService.setUserId("restApi03"); 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info(restApiService.toString());
		
		return restApiService.getUserId() + ":" + userName;
	}	
	
	@RequestMapping(method=RequestMethod.GET, value="/api04")
	public String getRestApi04(String userName) {
		
		restApiService.setUserId("restApi04");
		
		log.info(restApiService.toString());
		
		return restApiService.getUserId() + ":" + userName;
	}
}
