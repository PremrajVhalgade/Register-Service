package com.premraj.registerservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {

	@Autowired
	private JavaMailSender mailSender;
	
	public void sendMail(String To, String password) {
		
		SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(To);
        message.setSubject("One time password");
        message.setText("Your password is abxcdgf45er");
        mailSender.send(message);
        System.out.println("Mail sent");
	}
	

}
