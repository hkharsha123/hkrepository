package restauu1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class req4 {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification h = RestAssured.given();
		Response b = h.request(Method.GET,"/api/users/23");
System.out.println(b.prettyPrint());
	}

}
