package com.project.SecondHandCar.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.SecondHandCar.Model.Buyer;
import com.project.SecondHandCar.Service.CarService;

@RestController
public class SecondHandCarController {
@Autowired
	CarService ser;
	@RequestMapping("/")
	public ModelAndView HomePage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Registration");
		return mv;
	}
	@PostMapping("/saveBuyer")
	public ModelAndView saveBuyer(@ModelAttribute Buyer b) {
		return ser.saveBuyer(b);
	}
	@RequestMapping("/verify")
	public ModelAndView verify(@RequestParam("mobile") String mobile,@RequestParam("password")String password) {
		
		return ser.verifyUser(mobile,password);
	}
	
	
	@RequestMapping("/login")
	public ModelAndView LoginPage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Login");
		return mv;
	}
	@RequestMapping("/searchByModel")
	public ModelAndView getCars(@RequestParam("model")String model) {
		return ser.getCars(model);
	}
	
}
