package restauu1;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class reqp2 {

	public static void main(String[] args) 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification h = RestAssured.given();
		JSONObject ob=new JSONObject();
		ob.put("name", "harsha hk");
		ob.put("job", "manager");
		h.contentType(ContentType.JSON);
		h.body(ob.toJSONString());
		Response d = h.request(Method.PUT,"/api/users/2");
		System.out.println(d.prettyPrint());
		System.out.println(d.getStatusCode());

	}

}
