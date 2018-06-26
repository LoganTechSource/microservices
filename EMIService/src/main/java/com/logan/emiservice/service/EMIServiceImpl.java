package com.logan.emiservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.logan.emiservice.model.EMIData;

@Service
public class EMIServiceImpl implements EMIService {

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<EMIData> getAllEMIData() {
		System.out.println(" get all emi data service method ");
		ResponseEntity<List<EMIData>> responseEnitity =  restTemplate.exchange("http://reposervice/rest/repository/allemi", HttpMethod.GET, null, new ParameterizedTypeReference<List<EMIData>>() {});
		return responseEnitity.getBody();
	}

	@Override
	public void addEMIData(List<EMIData> emiDataList) {
		System.out.println(" add emi data service method");
		ResponseEntity<String> response  = restTemplate.postForEntity("http://reposervice/rest/repository/addemi", emiDataList, String.class);
	}

}
