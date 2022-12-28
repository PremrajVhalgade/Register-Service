package com.sendemail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sendemail.config.SendEmailConfig;

public class SendMail {
	public static void main(String[] args) {
		String to = "premrajvhalgade5@gmail.com";
		String from = "premvhalgade5@gmail.com";

		String host = "smtp.gmail.com";// we will be using smtp as gmail

		String password = "vizyyodxaefogwsd";

		Session session = SendEmailConfig.getEmailConfig(to, from, host, password);
		{

			try {
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
				// Set Subject: header field
				message.setSubject("This is the Subject Line!");

				// Now set the actual message
				message.setText("Your password is 454545");

				System.out.println("sending...");
				// Send message
				Transport.send(message);
				System.out.println("Sent message successfully....");
			} catch (MessagingException mex) {
				mex.printStackTrace();
			}

		}

	}

}
//	Session session = SendEmailConfig.getEmailConfig(to, from, host, password);
//	{
//
//		try {
//			MimeMessage message = new MimeMessage(session);
//			message.setFrom(new InternetAddress(from));
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//			// Set Subject: header field
//			message.setSubject("This is the Subject Line!");
//
//			// Now set the actual message
//			message.setText("This is actual message");
//
//			System.out.println("sending...");
//			// Send message
//			Transport.send(message);
//			System.out.println("Sent message successfully....");
//		} catch (MessagingException mex) {
//			mex.printStackTrace();
//		}
//
//	}
