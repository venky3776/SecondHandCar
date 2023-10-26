package com.project.SecondHandCar.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.SecondHandCar.Model.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {
	List<Car> findAllByModel(String model);

}
