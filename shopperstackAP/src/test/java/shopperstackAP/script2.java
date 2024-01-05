package shopperstackAP;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import base.required_data;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class script2 extends required_data  {
	@Test
	public void storeid() throws FileNotFoundException, ClassNotFoundException, IOException {
		//create_shoper();
		System.out.println("RTUYGUHJIOK");
		System.out.println(required_data.getID());
		RestAssured.baseURI=url;
		System.out.println("ttttttt");
		ValidatableResponse response = RestAssured.given()
				.pathParam("shopper", "shoppers")
				.pathParam("userid", required_data.getID())
				.when()
				.get("{shopper}/{userid}")
				.then().log().all();
				

		
		
				
				
		
	}

}
