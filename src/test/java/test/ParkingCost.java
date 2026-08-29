package test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import request.models.ParkRequest;
import response.models.ParkResponse;
import services.CostService;

@Listeners(listeners.TestListeners.class)
public class ParkingCost {
	@Test(description="calculate parking cost")
	void parkingCost() throws IOException {
		
		ParkRequest req = new ParkRequest.Builder().parkType("Valet")
				.entryDate("2027-09-06T13:53")
				.exitDate("2027-09-06T19:53")
				.build();

		CostService cost = new CostService();
		Map<String,Object> headers = new HashMap<>();
		headers.put("Accept", "application/json");
		
		Response response = cost.calculateCost(req,headers,"/calculate-cost");
	
		
		ParkResponse rs = (response.as(ParkResponse.class));
		
		System.out.println(rs.toString());
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(rs.getCost(),18);
		Assert.assertEquals(rs.getHours(),6);
	}

}
