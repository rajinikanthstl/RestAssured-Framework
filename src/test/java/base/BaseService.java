package base;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.Properties;

import filters.LoggingFilter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService{
	RequestSpecification requestSpecification;
	String BASE_URI;
	
	static {
		RestAssured.filters(new LoggingFilter());
	}
	
	public void readProperties() throws IOException {
		Path builtPath = Path.of(System.getProperty("user.dir"),"src","test", 
												"resources", "qa.properties"); 
		
		FileInputStream fis = new FileInputStream(builtPath.toFile());
		
		Properties p =new Properties();
		
		p.load(fis);
		
		BASE_URI = p.getProperty("BASE_URI");
		
		fis.close();		
	}
	
	
	public BaseService() throws IOException {
		 readProperties();
		 requestSpecification =  given().baseUri(BASE_URI);
	}
	
	//post request with payload and endpoint
	public Response postRequest(Object payload,String path) {
		return requestSpecification
				.contentType(ContentType.JSON)
				.header("Accept","application/json")
				.body(payload).post(path);
	}
	
	//post request with headers, payload and endpoint
	public Response postRequest(Map<String,Object> headers,Object payload,String path) {
		return requestSpecification
				.contentType(ContentType.JSON)
				.header("Accept","application/json")
				.headers(headers)
				.body(payload).post(path);
	}
	
	//get request with query parameters and endpoint
	public Response getRequest(Map<String,Object> params,String path) {
		return requestSpecification
				.contentType(ContentType.JSON)
				.queryParams(params).get(path);
	}
	
	//get request with auth headers,query parameters and endpoint
	public Response getRequest(Map<String,Object> auth,Map<String,Object> params,String path) {
		return requestSpecification
				.contentType(ContentType.JSON)
				.headers(auth)
				.queryParams(params)
				.get(path);
	}
	
	//get request with only endpoint
	public Response getRequest(String path) {
		return requestSpecification
				.contentType(ContentType.JSON)
				.get(path);
	}
	
	//delete request with auth headers and endpoint
	public Response deleteRequest(Map<String,Object> auth,String path) {
		return requestSpecification
				.contentType(ContentType.JSON)
				.headers(auth)
				.delete(path);
	}
}
