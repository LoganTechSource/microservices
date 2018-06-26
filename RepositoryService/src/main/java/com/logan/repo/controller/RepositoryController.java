package com.logan.repo.controller;

import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.logan.repo.emirepo.EMIRepository;
import com.logan.repo.emirepo.entity.EMIData;

@RestController
@RequestMapping("/rest/repository")
public class RepositoryController {
	
	@Autowired
	private EMIRepository emiRepository;
	
	@GetMapping("/allemi")
	public List<EMIData> getAllEMIData()
	{
		return emiRepository.findAll();
		
	}
	
	@PostMapping("/addemi")
	@ResponseStatus(value=HttpStatus.OK)
	public void addEmiData(@RequestBody final List<EMIData> emiDataList)
	{
		// Sample request
		/*[{
			"dueAmout": 1500,
			"dueDate": 1518977190666,
			"paidDate": 1518977190666,
			"paidStatus": "PAID"
		}]*/
		emiDataList.forEach(new Consumer<EMIData>() {
			@Override
			public void accept(EMIData t) {
				System.out.println(t.toString());
			}
		});
		
		System.out.println("save method calling");
		emiRepository.save(emiDataList);
		System.out.println("after data save");
	}
	
	
	
}
