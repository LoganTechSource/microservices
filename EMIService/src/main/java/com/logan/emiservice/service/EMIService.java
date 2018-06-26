package com.logan.emiservice.service;

import java.util.List;

import com.logan.emiservice.model.EMIData;

public interface EMIService {
	public List<EMIData> getAllEMIData();
	public void addEMIData(List<EMIData> emiDataList);
}
