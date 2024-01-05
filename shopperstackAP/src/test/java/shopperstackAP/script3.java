package shopperstackAP;

import org.testng.annotations.Test;

import base.required_data;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class script3 extends required_data{
	required_data rr= new required_data();
	script1 ss=new script1();
	@Test
public void getdata() {
		ss.create_shoper();
	RestAssured.baseURI=rr.url;
	System.out.println("dfgnhmj,k");
	System.out.println(rr.userID1);
	System.out.println(token);
	ValidatableResponse response = RestAssured.given()
			
			.pathParam("soppers", "shoppers")
			.pathParam("id", userID1)
			.header("Authorization", token)
			.when()
			.get("/{soppers}/{id}")
			.then().log().all();
					
	
}
}
