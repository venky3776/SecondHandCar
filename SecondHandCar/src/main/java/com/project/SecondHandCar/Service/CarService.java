package com.project.SecondHandCar.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.project.SecondHandCar.Model.Buyer;
import com.project.SecondHandCar.Model.Car;
import com.project.SecondHandCar.Repository.BuyerRepository;
import com.project.SecondHandCar.Repository.CarRepository;
@Service
public class CarService {
@Autowired
	BuyerRepository rep;
@Autowired
CarRepository crep;
	public ModelAndView saveBuyer( Buyer b) {
		rep.save(b);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Login");
		return mv;
	}
	public ModelAndView verifyUser(String mobile,String password) {
		ModelAndView mv=new ModelAndView();
		Buyer b=rep.findByMobile(mobile);
		if(b==null) {
			mv.setViewName("Login");
			return mv;
		}
		if(b.getPassword().equals(password)) {
			mv.setViewName("search");
			return mv;
		}
		mv.setViewName("Login");
		return mv;
	}
	public ModelAndView getCars(String model) {
		List<Car> list=crep.findAllByModel(model);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("search");
		mv.addObject("l",list);
		return mv;
	}
}
