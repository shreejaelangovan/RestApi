package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	boolean existsById(int primaryKey);
	
	public List<Car> findByOwners(int owners);
	
	public List<Car> findByAddress(String address);
	
	public List<Car> findByCarName(String carName);
	
	public List<Car> findByOwnersOrCarType(int owners, String carType);
	
	public List<Car> findByOwnersAndCarType(int owners, String carType);
}
