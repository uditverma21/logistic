package com.logistic.logistic.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistic.logistic.entities.Load;

public interface LogisticDao extends JpaRepository<Load,Long>{
	
}
