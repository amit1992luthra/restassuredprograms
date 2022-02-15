package Sample;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import cucumber.api.java.it.Data;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import pojoclass.postrequest;

public class dummy {

	@Test(enabled = false)
	public void getmethod() {

		RestAssured.baseURI = "http://localhost:3000";
		given().get("/students").then().statusCode(200).log().all();
	}

	@Test(enabled = false)
	public void postmethod() {

		RestAssured.baseURI = "http://localhost:3000";

		JSONObject request = new JSONObject();
		request.put("id", 8);
		request.put("name", "amit luthra");
		request.put("stream", "humanities");

		given().contentType(ContentType.JSON)

				.body(request.toJSONString()).post("/students").then().statusCode(201).log().all();
	}

	@Test(enabled = true)
	public void deletemethod() {

		RestAssured.baseURI = "http://localhost:3000";

		given().contentType(ContentType.JSON)

				.delete("/students/105").then().statusCode(200).log().all();
	}

	@Test(enabled = false)
	public void putmethod() {

		RestAssured.baseURI = "http://localhost:3000";

		JSONObject request = new JSONObject();
		
		request.put("name", "preeti");
		request.put("stream", "humanities");

		given().contentType(ContentType.JSON)

				.body(request.toJSONString()).put("/students/104").then().statusCode(200).log().all();
	}
	
	@Test(enabled = false)
	public void patchmethod() {

		RestAssured.baseURI = "http://localhost:3000";

		JSONObject request = new JSONObject();
		
		request.put("name", "preeti khurana");
		//request.put("stream", "humanities");

		given().contentType(ContentType.JSON)

				.body(request.toJSONString()).patch("/students/104").then().statusCode(200).log().all();
	}
	
	
	
	
	@Test(enabled=false)
	public void Postmethodwithhash()
	{
		
		RestAssured.baseURI="http://localhost:3000";
		
		/*
		Map<String,Object> jsonbody = new HashMap<String ,Object>();
		
		jsonbody.put("stream", "commerce");
		jsonbody.put("firstname", "aditya");
		jsonbody.put("lastname", "sharma");
		
		System.out.println(jsonbody);*/
		
		
		JSONObject request = new JSONObject();
		
		JSONObject request1 = new JSONObject();
		
		request1.put("firstname", "amit");
		request1.put("lastname", "sharma");
		
		request.put("stream", "commerce");
		request.put("firstname", "aditya");
		request.put("lastname", "sharma");
		request.put("category", request1);
		
		
		JSONArray obj = new JSONArray();
		
		obj.add("amit");
		obj.add("hello");
		
		request.put("Arraylist", obj);
		
		//System.out.println(request);

		given()
			.contentType(ContentType.JSON)
			.body(request.toJSONString())
		 	.post("/students").
		then()
		    .body("category.firstname",equalTo("aditya"))
		    .log().all();
	}
	
	
	@Test()
	public void Postmethodwithpojo()
	{
		
		RestAssured.baseURI="http://localhost:3000";
		postrequest obj = new postrequest();
		obj.setFirstname("amit");
		obj.setId(0);
		obj.setLastname("luthra");
		obj.setStream("commerce");
		
		
		
		System.out.println(obj);
		
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValueAsString();
		

		given()
			.contentType(ContentType.JSON)
			.body(obj)
		 	.post("/students").
		then()
		    .body("category.firstname",equalTo("aditya"))
		    .log().all();
	}


}
