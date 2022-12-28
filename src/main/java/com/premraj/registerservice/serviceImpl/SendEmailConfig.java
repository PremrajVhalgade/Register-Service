package com.premraj.registerservice.serviceImpl;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class SendEmailConfig {
	
public static Session getEmailConfig(String to,String from,String host,String password) {
	
	Properties properties=System.getProperties();//get system properties
	
	//Setup mail server
	properties.put("mail.smtp.host", host);
	properties.put("mail.smtp.port", "465");
	properties.put("mail.smtp.ssl.enable", "true");
	properties.put("mail.smtp.auth", "true");
	
	// Get the session object and pass uname and password
			Session session=Session.getInstance(properties, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(to, password);
				}
			});
			
			session.setDebug(true);//used to debug smtp issues
	
	return session;
}
}
