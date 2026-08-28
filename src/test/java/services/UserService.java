package services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import base.BaseService;
import io.restassured.response.Response;
import request.models.CreateUserRequest;

public class UserService {
	
	BaseService baseService = null;
	AuthService authService = null;
	String BASE_PATH = "/api";
	Map<String,Object> authHeader = null;
	
	public Map<String,Object> setAuth() throws IOException {
		authService = new AuthService();
		String token = authService.getToken();
		authHeader = new HashMap<>();
		authHeader.put("Authorization","Bearer "+token);
		
		return authHeader;		
	}
	
	public Response Search(Map<String,Object> qparams,String path) throws IOException {
		
		baseService = new BaseService();
		
		return baseService.getRequest(setAuth(), qparams, BASE_PATH+path);
	}
	
	public Response Create(CreateUserRequest payload,String path) throws IOException {
			
			baseService = new BaseService();
			
			return baseService.postRequest(setAuth(), payload, BASE_PATH+path);
	}
	
	public Response Delete(String path,String pathParams) throws IOException {
		
		baseService = new BaseService();
		
		return baseService.deleteRequest(setAuth(),BASE_PATH+path+"/"+pathParams);
	}
	
	

}
