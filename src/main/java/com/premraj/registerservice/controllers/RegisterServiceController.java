package com.premraj.registerservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.premraj.registerservice.constant.Status;
import com.premraj.registerservice.entity.ActivateAccountDetails;
import com.premraj.registerservice.entity.Login;
import com.premraj.registerservice.entity.User;
import com.premraj.registerservice.serviceImpl.ActivateAccountDetailsServiceImpl;
import com.premraj.registerservice.serviceImpl.LoginServiceImpl;
import com.premraj.registerservice.serviceImpl.MailSenderServiceImpl;
import com.premraj.registerservice.serviceImpl.UserDetailsServiceImpl;

@Controller
public class RegisterServiceController {

	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;

	@Autowired
	private LoginServiceImpl loginServiceImpl;
	
	@Autowired
	private ActivateAccountDetailsServiceImpl activateAccountDetailsServiceImpl;

	@Autowired
	private MailSenderServiceImpl mailSenderServiceImpl;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView showRegistrationForm() {
		return new ModelAndView("register", "user", new User());
	}

	@RequestMapping(value = "/addSignup", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User userDetails, BindingResult result) {

		if (result.hasErrors()) {
			System.err.println("error@@@@@@");
			return "register";
		} else {
			System.out.println(userDetails);
			userDetails.setStatus("inactive");
			System.out.println("save user controller");
			this.userDetailsServiceImpl.saveUser(userDetails);
			mailSenderServiceImpl.sendMail(userDetails.getEmail(), userDetails.getFirstName());
		}
		return "ThankYou";
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

	@RequestMapping(value = "/activateaccount", method = RequestMethod.GET)
	public ModelAndView activateUser() {
		return new ModelAndView("ActivateAccount", "ActivateAccount", new ActivateAccountDetails());
	}

	@PostMapping("/activate")
	public String getAccountActivationDetails(
			@ModelAttribute("activateAccount") ActivateAccountDetails activateAccountDetails,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.err.println("@@@@");
			return "ActivateAccount";
		} else {
			System.out.println(activateAccountDetails);
			this.activateAccountDetailsServiceImpl.getAccountActivationDetails(
					activateAccountDetails.getRegisteredEmail(), activateAccountDetails.getTemporaryPassword(),
					activateAccountDetails.getNewPassword(), activateAccountDetails.getConfirmPassword());
			return "ThankYou";

		}

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLoginForm() {
		return new ModelAndView("Login", "Login", new Login());
	}

	@RequestMapping(value = "/thankyou", method = RequestMethod.POST)
	public String loginUser(@ModelAttribute("login") Login login, BindingResult result) {
		if (result.hasErrors()) {
			System.err.println("error@@@@@@");
			return "Login";
		} else {
			this.loginServiceImpl.getUserByEmailAndPassword(login.getEmail(), login.getPassword());
		}
		return "ThankYou";
	}

}
