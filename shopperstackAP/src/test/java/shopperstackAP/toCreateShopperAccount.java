package shopperstackAP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.testng.annotations.Test;

import base.required_data;
import base.staticData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseBodyData;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class toCreateShopperAccount extends required_data {
	
	@Test
	public void create_shoper() throws FileNotFoundException, IOException, ClassNotFoundException {
		RestAssured.baseURI=url;
		
	String dd = RandomStringUtils.randomAlphabetic(6);
	String email=dd+"@gmail.com";
	System.out.println(email);
	
	  Response response =  RestAssured.given()
	                .pathParam("shoppers", "shoppers")
	                .body("{\r\n"
	                		+ "  \"city\": \"banglore\",\r\n"
	                		+ "  \"country\": \"India\",\r\n"
	                		+ "  \"email\":  \"" + email + "\",\n"//\"dgdgh@gmail.com\",\r\n"
	                		+ "  \"firstName\": \"fd\",\r\n"
	                		+ "  \"gender\": \"MALE\",\r\n"
	                		+ "  \"lastName\": \"dd\",\r\n"
	                		+ "  \"password\": \"" + password + "\",\n"
	                		+ "  \"phone\": 9998887766,\r\n"
	                		+ "  \"state\": \"kar\",\r\n"
	                		+ "  \"zoneId\": \"ALPHA\"\r\n"
	                		+ "}")
	                .contentType(ContentType.JSON)  // Specify the content type of the request body
	                .when()
	                .post("/{shoppers}");
	               
	               
	            	response.then().log().all();
	            //	required_data.setID(response.jsonPath().getString("data.userId"));
	            	//System.out.println(required_data.getID());
	Object userID = response.jsonPath().get("data.userId");
	Object email1 = response.jsonPath().get("data.email");
	String ids = userID.toString();
	System.out.println("gfhj");
	required_data.setID(ids);
	System.out.println(required_data.getID());
	emailrr=email1.toString();
	System.out.println(emailrr);
	System.out.println(password);
 
	
	
			
		
	}
	
		
	

}
