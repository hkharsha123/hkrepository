package restauu1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class req5 {

	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification h = RestAssured.given();
         Response k = h.request(Method.GET,"/api/unknown");
         System.out.println(k.prettyPrint());
	}

}
