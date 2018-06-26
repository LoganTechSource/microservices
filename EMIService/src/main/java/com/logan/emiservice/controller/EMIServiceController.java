package com.logan.emiservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.logan.emiservice.model.EMIData;
import com.logan.emiservice.service.EMIService;

@RestController
@RequestMapping("/emiservice")
public class EMIServiceController {

	@Autowired
	EMIService emiServiceImpl;
	
	@RequestMapping(value="/allemi", method=RequestMethod.GET)
	public List<EMIData> fetchAllEmiData()
	{
		System.out.println(" inside all emi endpoint ");
		return emiServiceImpl.getAllEMIData();
	}
	
	@PostMapping("/addemi")
	public String addEMIData(@RequestBody List<EMIData> emiDataList)
	{
		System.out.println(" add emi data ");
		emiServiceImpl.addEMIData(emiDataList);
		return "EMI added Successfully";
	}
}
