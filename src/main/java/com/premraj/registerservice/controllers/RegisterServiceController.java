package com.premraj.registerservice.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterServiceController {

	@GetMapping("/home")
	// @ResponseBody
	public String homePage() {
		return "HomePage";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	// @ResponseBody
	public String registerUser(
	// @RequestParam("firstName") String firstName, @RequestParam("lastName") String
	// lastName,
	// @RequestParam("email") String email, @RequestParam("mobileNo") String
	// mobileNo,
	// @RequestParam("dob") String dob, @RequestParam("policyNo") String policyNo,
	// @RequestParam("gender") String gender, @RequestParam("countryId") String
	// country,
	// @RequestParam("state") String state, @RequestParam("city") String city
	) {

//		System.out.println(firstName);
//		System.out.println(lastName);
//		System.out.println(email);
//		System.out.println(mobileNo);
//		System.out.println(dob);
//		System.out.println(policyNo);
//		System.out.println(gender);
//		System.out.println(country);
//		System.out.println(state);
//		System.out.println(city);
		return "UserRegistration";
	}

	@RequestMapping(value = "/activateaccount", method = RequestMethod.GET)
	// @ResponseBody
	public String activateUser() {
		return "ActivateAccount";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	// @ResponseBody
	public String login(HttpServletRequest request) {
		String email = request.getParameter("email");
		String password = request.getParameter("inputPassword3");
		System.out.println(email);
		System.out.println(password);
		return "Login";
	}

	@RequestMapping(value = "/forgetpassword", method = RequestMethod.GET)
	// @ResponseBody
	public String forgetPassword() {
		return "ForgetPassword";
	}

	@RequestMapping(value = "/thankyou", method = RequestMethod.GET)
	// @ResponseBody
	public String thankYouPage() {
		return "ThankYou";
	}

//	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
//	// @ResponseBody
//	public String goToWelcomePage(@RequestParam String fName, String lName, String email, long policyNo, ModelMap map) {
//		map.put("fName", fName);
//		map.put("lName", lName);
//		map.put("email", email);
//		map.put("policyNo", policyNo);
//		return "welcome";
//	}

}
