package com.example.demo.restapi.controller;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class RestApiControllerTest {
	
	//@Autowired
	//private RestApiService restApiService;
	
	@Autowired
	private RestApiController restApiController;
		
	@Test
	void testGetRestApi01() {
		
		//RestApiController restApiController = new RestApiController(restApiService);
		
		String name = "user01";
				
		String resultApi = restApiController.getRestApi01(name);
        		
		assertEquals("restApi01"+":"+name, resultApi);
				
		//fail("Not yet implemented");
	}

	@Test
	void testGetRestApi02() {
		//RestApiController restApiController = new RestApiController(restApiService);
		       
		assertAll("restApi02",  		
				() -> assertEquals("restApi02"+":"+"user01", restApiController.getRestApi02("user01")), 
				() -> assertEquals("restApi02"+":"+"user01", restApiController.getRestApi02("user02")) ,
				() -> assertEquals("restApi02"+":"+"user03", restApiController.getRestApi02("user03")) 
			);
				
		//fail("Not yet implemented");		
	}

	@Test
	void testGetRestApi03() {
		//RestApiController restApiController = new RestApiController(restApiService);
		String name = "user01";
				
		String resultApi = restApiController.getRestApi03(name);
		System.out.print(resultApi);
		log.info(resultApi);
		assertEquals("restApi03"+":"+name, resultApi);
		
		//fail("Not yet implemented");
		
	}

	@Test
	void testGetRestApi04() {
		//RestApiController restApiController = new RestApiController(restApiService);
		String name = "user01";
				
		String resultApi = restApiController.getRestApi04(name);
        System.out.print(resultApi);
		log.info(resultApi);
		assertEquals("restApi04"+":"+name, resultApi);
				
		//fail("Not yet implemented");
	}

}
