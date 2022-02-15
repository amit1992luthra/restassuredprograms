package Sample;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import groovyjarjarantlr4.v4.parse.ANTLRParser.sync_return;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class post {

	@Test
	public void test1()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2";

		Map<String , Object> map = new HashMap<String,Object>();
		map.put("name","amit");
		map.put("role","Admin");

		System.out.println(map);
		
		JSONObject request = new JSONObject();
		request.put("id",0);
		request.put("username","amit.luthra");
		request.put("firstName","amit");
		request.put("lastName","luthra");
		request.put("email","a@a.com");
		request.put("phone","9876543210");
		request.put("userStatus",0);
		System.out.println(request.toJSONString());



		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.body(request.toJSONString()).
		when()
			.post("/user").
		then()
			.statusCode(200);
	}

}
