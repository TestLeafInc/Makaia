package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class TC004_GetIncidents extends RESTAssuredBase{

	@BeforeTest
	public void setValues() {
		testCaseName = "Get Existing Incident (REST)";
		testDescription = "Get all incidents and Print the first number";
		nodes = "Incident";
		authors = "Babu";
		category = "API";
		dataFileName = "TC001";
		dataFileType = "JSON";
	}

	@Test()
	public void getIncidents() {		
		
		// Get the request
		Response response = get("table/incident");
				
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);	
		
		// Verify the response time
		verifyResponseTime(response, 10000);
		
		// Print the first incident number
		String number = (String) response.jsonPath().getList("result.number").get(0);
		System.out.println("Number is "+number);
		
	}


}





