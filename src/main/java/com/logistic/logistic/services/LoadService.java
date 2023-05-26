package com.logistic.logistic.services;

import java.util.List;

import com.logistic.logistic.entities.Load;

public interface LoadService {
	
	public List<Load> getLoads();
	
	public Load getLoad(long loadId);
}
