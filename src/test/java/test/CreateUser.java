package test;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import request.models.CreateUserRequest;
import response.models.CreateUserResponse;
import response.models.User;
import services.UserService;

public class CreateUser{
	
	@Test(description="creating a user with valid data")
	void createUser() throws IOException {
		
		UserService user = new UserService();
		
		CreateUserRequest payload = new CreateUserRequest.Builder()
										.firstName("Rajesh")
										.lastName("Chatla")
										.email("rajesh@gmail.com")
										.dob("1992-10-31")
										.address("Hyderabad")
										.country("india")
										.gender("male")
										.mobile("8897654543")
										.skills(Arrays.asList("aws"))
										.build();
				 						
		try {
			Response response = user.Create(payload,"/users");
			CreateUserResponse res = response.as(CreateUserResponse.class);
			User userData = res.getUser();
			
			System.out.println("first_name:"+userData.getFirstName());
			System.out.println("last_name:"+userData.getLastName());
			System.out.println("email:"+userData.getEmail());
			System.out.println("mobile:"+userData.getMobile());
			System.out.println("dob:"+userData.getDob());
			System.out.println("gender:"+userData.getGender());
			System.out.println("address:"+userData.getAddress());
			System.out.println("country:"+userData.getCountry());
			System.out.println("skills:"+userData.getSkills());	
			System.out.println("id:"+userData.getId());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}
