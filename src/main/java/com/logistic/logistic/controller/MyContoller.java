package com.logistic.logistic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.logistic.logistic.entities.Load;
import com.logistic.logistic.services.LoadService;

@RestController
public class MyContoller {
	@Autowired
	private LoadService loadserivice;
	
	@GetMapping("/load")
	public List<Load> getLoads()
	{
		return this.loadserivice.getLoads();
		
	}
	
	@GetMapping("/load/{loadId}")
	public Load getLoad(@PathVariable String loadId)
	{
		return this.loadserivice.getLoad(Long.parseLong(loadId));
	}

}
