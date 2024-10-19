package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.User;
import com.spring.service.ServiceLayer;

@Controller
public class HomeController {
	@Autowired
	private ServiceLayer serviceLayer;

	@RequestMapping(value = "reg")
	public String register(@ModelAttribute User user, Model model) {
		System.out.println("regiser Controller");
		model.addAttribute("User", user);
		serviceLayer.registerService(user);
		return "SuccessRegister";

	}

	@RequestMapping(value = "login")
	public String login(@RequestParam String id, @RequestParam String accPin, Model model) {
		System.out.println("login method in controller");
		User user = serviceLayer.loginService(id, accPin);
		if (user != null) {
			model.addAttribute("User", user);
			System.out.println(user);
			return "successLogin";
		} else {
			return "invalid";
		}

	}
	@RequestMapping(value = "deposit")
	public String deposit(@RequestParam String id , @RequestParam String pin , @RequestParam double depositeMoney,Model model) {
		System.out.println("Deposit Controller");
		User user=serviceLayer.depositeService(id, pin, depositeMoney);
		model.addAttribute("User", user);
		return "successDeposit";
		
	}
	@RequestMapping(value = "withdraw")
	public String withdraw(@RequestParam String id,@RequestParam String pin, @RequestParam double withdrawMoney, Model model) {
		System.out.println("Withdraw controller");
		User user=serviceLayer.withdrawService(id, pin, withdrawMoney);
		model.addAttribute("User", user);
		return "successWithdraw";
		
		
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public String getDetails(@PathVariable String id, Model model) {
		System.out.println("details controller");
		User user = serviceLayer.getAccDetails(id);
		System.out.println(user);
		return "checkAccDetails";

	}

	

}
