package com.logistic.logistic.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.logistic.logistic.entities.Load;

@Service
public class LoadServiceImpl implements LoadService {
	
	List<Load> list;
	@Override
	public List<Load> getLoads() {
		return list;
	}
	@Override
	public Load getLoad(long loadId) {
		Load c=null;
		return null;
	}
	

}
