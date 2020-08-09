package restApiTest;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

public class APITest {
	
	
	
	@Test(enabled = true)
	public void validateGetusersList() {
		
		String response=		
		given()// beginning of given section
		.queryParam("page", 2).// adding query parameter
		when()
		.get("https://reqres.in/api/users").// get method
		then() 
		.statusCode(200).
		and()// Status code validation
		.body("page",equalTo(2))//  response body validation
		.and().body("data.first_name", hasItems("Michael","Lindsay","George"))
		.and().header("Content-Type", "application/json; charset=utf-8")
		.extract().asString();
		
		
		System.out.println(response);
		System.out.println(JsonPath.read(response, "$.data[1].first_name"));	
		
		
	}
	
	
	
	@Test()
	public void validateCreateUser() {
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("name", "Rohit");
		map.put("job", "programmer");
		
		given().
		contentType("application/json").body(map)
		.when().post("https://reqres.in/api/users")
		.then()
		.statusCode(201).log().body();
		
	}	
	
	
	
	
	@Test()
	public void getRequestWithAuthorization() {
		

		given()
		.auth().basic("postman", "password")
		
		
		.when()
		.get("https://postman-echo.com/basic-auth").// get method
		then() 
		.statusCode(200);
		
		
	}
	
	
	
	@Test(enabled = true)
	public void validateUpdateUser() {
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("name", "Rohit");
		map.put("job", "programmer");
		
		given().
		contentType("application/json").body(map)
		.when().put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200).log().all();
		
	}
	
	
	@Test(enabled = true)
	public void deleteUser() {
		given().
		when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204);
	}
	
	
	
	
	
	
	
	

}
