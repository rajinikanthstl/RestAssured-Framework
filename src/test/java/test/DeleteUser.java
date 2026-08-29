package test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import services.UserService;

@Listeners(listeners.TestListeners.class)
public class DeleteUser {
	
	@Test(description="delete user by Id")
	public void Delete() throws IOException {
		
		UserService user = new UserService();
		
		Response response = user.Delete("/users","1095");
		
		System.out.println(response.jsonPath().getString("message"));
	}
}
