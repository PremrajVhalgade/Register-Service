package com.premraj.registerservice.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.premraj.registerservice.constant.Status;
import com.premraj.registerservice.model.ActivateAccount;
import com.premraj.registerservice.model.Login;
import com.premraj.registerservice.model.UserDetails;
import com.premraj.registerservice.serviceImpl.ActivateAccountServiceImpl;
import com.premraj.registerservice.serviceImpl.LoginServiceImpl;
import com.premraj.registerservice.serviceImpl.UserDetailsServiceImpl;
import com.sendemail.SendMail;

@Controller
public class RegisterServiceController {

	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;

	@Autowired
	private LoginServiceImpl loginServiceImpl;
	
	@Autowired
	private ActivateAccountServiceImpl activateAccountServiceImpl;
	
	@Autowired
	private SendMail sendMail;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView showRegistrationForm() {
		return new ModelAndView("register", "user", new UserDetails());
	}

	@RequestMapping(value = "/addSignup", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") UserDetails userDetails, BindingResult result) {

		if (result.hasErrors()) {
			System.err.println("error@@@@@@");
			return "register";
		} else {
			System.out.println(userDetails);
			userDetails.setStatus(Status.IN_ACTIVE);
			this.userDetailsServiceImpl.saveUser(userDetails);
		}
		return "ThankYou";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLoginForm() {
		return new ModelAndView("Login", "Login", new Login());
	}

	@RequestMapping(value = "/thankyou", method = RequestMethod.POST)
	public String loginUser(@ModelAttribute("login") Login loggedInUser, BindingResult result) {

		if (result.hasErrors()) {
			System.err.println("error@@@@@@");
			return "Login";
		} else {
			loginServiceImpl.saveLoggedInUser(loggedInUser);
		}
		return "ThankYou";
	}

	@RequestMapping(value = "/activateaccount", method = RequestMethod.GET)
	public ModelAndView activateUser() {
		
		return new ModelAndView("ActivateAccount", "ActivateAccount", new ActivateAccount());
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String activateAccount(@ModelAttribute("activateAccount") ActivateAccount activatedAccount, BindingResult result) {

		if (result.hasErrors()) {
			System.err.println("error@@@@@@");
			return "ActivateAccount";
		} else {
			this.activateAccountServiceImpl.activateAccount(activatedAccount);
			System.out.println(activatedAccount.getUserId());
			System.out.println(activatedAccount.getRegisteredEmail());
			System.out.println(activatedAccount.getTemporaryPassword());
			System.out.println(activatedAccount.getNewPassword());
			System.out.println(activatedAccount.getConfirmPassword());
			return "welcome";
		}
		
	}
	

	@GetMapping("/home")
	public String homePage() {
		return "HomePage";
	}
	
	@GetMapping("/welcome")
	public String welcomePage() {
		return "welcome";
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
