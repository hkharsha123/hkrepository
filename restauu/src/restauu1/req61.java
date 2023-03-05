package restauu1;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class req61 {

	public static void main(String[] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification re = RestAssured.given();
		Response h = re.request(Method.GET,"/api/users/2");
System.out.println( h.asString());
	}

}
