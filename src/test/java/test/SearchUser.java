package test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import response.models.SearchResponse;
import response.models.UserData;
import services.UserService;
@Listeners(listeners.TestListeners.class)
public class SearchUser {
	
	@Test(description="search user by firstname")
	void searchUser() throws IOException {
		
		UserService user = new UserService();
		
		Map<String,Object> qparams = new HashMap<>();
		qparams.put("search","Carmine");
		
		Response response = user.Search(qparams,"/users");
		
		SearchResponse res = response.as(SearchResponse.class);
		
		List<UserData> data = res.getData();
		
		for(UserData o:data) {
			System.out.println("id:"+o.getId());
			System.out.println("first_name:"+o.getFirstName());
			System.out.println("last_name:"+o.getLastName());
			System.out.println("email:"+o.getEmail());
			System.out.println("mobile:"+o.getMobile());
			System.out.println("dob:"+o.getDob());
			System.out.println("gender:"+o.getGender());
			System.out.println("country:"+o.getCountry());
			System.out.println("skills:"+o.getSkills());
		}
	}
}
