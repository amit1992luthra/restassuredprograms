package Sample;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojoclass.Category;
import pojoclass.postrequest;
import com.fasterxml.jackson.databind.*;


import com.fasterxml.jackson.core.JsonProcessingException;

public class sample123 {
	
	
	@Test(enabled = false)
	public void Postmethodwithpojo() throws JsonProcessingException
	{
		
		RestAssured.baseURI="http://localhost:3000";
		postrequest obj = new postrequest();
		obj.setFirstname("amit");
		obj.setId(0);
		obj.setLastname("luthra");
		obj.setStream("commerce");
		
		
		
		System.out.println(obj);
		
		
	
		ObjectMapper map = new ObjectMapper();
		
		String abc = map.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		System.out.println(abc);
		
		
		
/*
		given()
			.contentType(ContentType.JSON)
			.body(obj)
		 	.post("/students").
		then()
		    .body("category.firstname",equalTo("aditya"))
		    .log().all();
*/	}

	
	
	
	@Test()
	public void Postmethodwithpojo1() throws JsonProcessingException
	{
		
		RestAssured.baseURI="http://localhost:3000";
		postrequest obj = new postrequest();
		Category obj1 = new Category();
		
		obj1.setId(0);
		obj1.setName("hello");
		obj.setCategory(obj1);
		obj.setFirstname("amit");
		obj.setId(0);
		obj.setLastname("luthra");
		obj.setStream("commerce");
		
		
		
		System.out.println(obj);
		
		
	
		ObjectMapper map = new ObjectMapper();
		
		String abc = map.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		System.out.println(abc);
		
		
		
/*
		given()
			.contentType(ContentType.JSON)
			.body(obj)
		 	.post("/students").
		then()
		    .body("category.firstname",equalTo("aditya"))
		    .log().all();
*/	}

}
