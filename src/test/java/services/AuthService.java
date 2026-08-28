package services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import base.BaseService;
import io.restassured.response.Response;

public class AuthService extends BaseService{
	
	String BASE_PATH = "/api";

	public AuthService() throws IOException {
		super();
	}
	
	public String getToken() {
		Map<String,String> payload = new HashMap<>();
		payload.put("email","admin@jalaacademy.com");
		payload.put("password","admin123");
		
		Response response = postRequest(payload,BASE_PATH+"/signin");
		
		return response.path("token");
	}

}
