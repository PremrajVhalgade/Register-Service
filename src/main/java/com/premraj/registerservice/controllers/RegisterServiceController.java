package com.premraj.registerservice.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.premraj.registerservice.constant.Status;
import com.premraj.registerservice.model.UserDetails;
import com.premraj.registerservice.service.RegisterService;
import com.premraj.registerservice.serviceImpl.RegisterServiceImpl;

@Controller
public class RegisterServiceController {
	
	@Autowired
	private RegisterServiceImpl service ;

	@GetMapping("/home")
	public String homePage() {
		return "HomePage";
	}

//	@RequestMapping(value = "/signup", method = RequestMethod.GET)
//	public String registerUser()
//	 {
//		return "UserRegistration";
//	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView showRegistrationForm()
	 {
		return new ModelAndView("register", "user", new UserDetails());
	}
	
	@RequestMapping(value = "/addSignup", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user")UserDetails userDetails,
			BindingResult result) {
				
		if(result.hasErrors()) {
			System.err.println("error@@@@@@");
			return "register";
		} else {
			userDetails.setStatus(Status.IN_ACTIVE);
			service.saveUser(userDetails);
		}
		return "welcome";	
	}

	@RequestMapping(value = "/activateaccount", method = RequestMethod.GET)
	public String activateUser() {
		return "ActivateAccount";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		String email = request.getParameter("email");
		String password = request.getParameter("inputPassword3");
		System.out.println(email);
		System.out.println(password);
		return "Login";
	}

	@RequestMapping(value = "/forgetpassword", method = RequestMethod.GET)
	public String forgetPassword() {
		return "ForgetPassword";
	}

	@RequestMapping(value = "/thankyou", method = RequestMethod.GET)
	public String thankYouPage() {
		return "ThankYou";
	}


}
