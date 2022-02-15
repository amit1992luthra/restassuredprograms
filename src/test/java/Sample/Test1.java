package Sample;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import io.restassured.matcher.RestAssuredMatchers.*;


public class Test1 {
	
	
	@Test(enabled = true)
	public void test1()
	{
		Response response = RestAssured.get("https://petstore.swagger.io/v2/pet/922296814049804047");
		String Statuscode = response.getStatusLine();
		String exp = response.jsonPath().getString("name");
		System.out.println(exp);
		/*System.out.println(Statuscode);
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.headers().toString());*/
	}

		
		
			

	


	

}
