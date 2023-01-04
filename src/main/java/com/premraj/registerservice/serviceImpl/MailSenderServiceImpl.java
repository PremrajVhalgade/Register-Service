package com.premraj.registerservice.serviceImpl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.premraj.registerservice.entity.ActivateAccountDetails;
import com.premraj.registerservice.repository.ActivateAccountDetailsRepo;

@Service
public class MailSenderServiceImpl {

	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private ActivateAccountDetailsRepo activateAccountDetailsRepo;

	public void sendMail(String To, String name) {

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(To);
		message.setSubject("One time password");
		String tempPassword = generateTempPassword();
		String sf1 = String.format("Dear %s your temporary password is : %s", name, tempPassword);
		message.setText(sf1);
		mailSender.send(message);

		ActivateAccountDetails activateAccountDetails = new ActivateAccountDetails();
		activateAccountDetails.setRegisteredEmail(To);
		activateAccountDetails.setTemporaryPassword(tempPassword);
		this.activateAccountDetailsRepo.save(activateAccountDetails);
		System.out.println("Saved email and tempPass to db");

		System.out.println("Mail sent");
	}

	private String generateTempPassword() {
		int len = 8;
		System.out.println("Generating password using random() : ");
		System.out.print("Your new password is : ");

		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";
		String values = Capital_chars + Small_chars + numbers + symbols;
		Random rndm_method = new Random();
		char[] password = new char[len];
		for (int i = 0; i < len; i++) {
			password[i] = values.charAt(rndm_method.nextInt(values.length()));
		}
		String tempPassword = new String(password);
		return tempPassword;
	}




}
