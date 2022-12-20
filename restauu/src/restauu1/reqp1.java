package restauu1;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class reqp1 {

	public static void main(String[] args)
	{
	   RestAssured.baseURI="https://reqres.in/";
	   RequestSpecification h = RestAssured.given();
	   JSONObject s=new JSONObject();
	   s.put("name", "harsha hk");
	   s.put("job", "test engineer");
	   h.contentType(ContentType.JSON);
	   h.body(s.toJSONString());
	 Response c = h.request(Method.POST,"/api/users");
	   
			   System.out.println(c.prettyPrint());

	}

}
