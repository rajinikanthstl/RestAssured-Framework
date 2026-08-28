package services;

import java.io.IOException;
import java.util.Map;

import base.BaseService;
import io.restassured.response.Response;

public class CostService extends BaseService{
	
	public CostService() throws IOException {
		super();
	}

	public Response calculateCost(Object payload,Map<String,Object> headers,String endpoint) throws IOException {
		BaseService baseService = new BaseService();
		String BASE_PATH = "/webpark";
		
		Response reqSpec = baseService.postRequest(headers,payload,BASE_PATH+endpoint);
		
		return reqSpec;
	}
}
