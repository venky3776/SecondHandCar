package com.project.SecondHandCar.Repository;
import com.project.SecondHandCar.Model.*;
import java.util.*;
import org.springframework.data.repository.CrudRepository;

public interface BuyerRepository extends CrudRepository<Buyer, Integer> {

	Buyer findByFirstname(String fname);

	Buyer findByMobile(String mobile);



}
