package selenium;

import java.util.*; 
import javax.mail.*; 
import javax.mail.internet.*; 
import javax.activation.*; 

public class SendEmail { 

	public static void main(String[] args) { 
		
		// change accordingly 
		final String username = "admin@dopeidea.co.za"; 
		
		// change accordingly 
		final String password = "mail.dopeidea.co.za"; 
		
		// or IP address 
		final String host = "mail.dopeidea.co.za"; 

		// Get system properties 
		Properties props = new Properties();			 
		
		// enable authentication 
		props.put("mail.smtp.auth", host);			 
		
		// enable STARTTLS 
		props.put("mail.smtp.starttls.enable", "true");	 
		
		// Setup mail server 
		props.put("mail.smtp.host", "mail.dopeidea.co.za");	 
		
		// TLS Port 
		props.put("mail.smtp.port", "465");				 

		// creating Session instance referenced to 
		// Authenticator object to pass in 
		// Session.getInstance argument 
		Session session = Session.getInstance(props, 
		new javax.mail.Authenticator() { 
			
			//override the getPasswordAuthentication method 
			protected PasswordAuthentication 
						getPasswordAuthentication() { 
										
				return new PasswordAuthentication(username, 
												password); 
			} 
		}); 

		try { 
			
			// compose the message 
			// javax.mail.internet.MimeMessage class is 
			// mostly used for abstraction. 
			Message message = new MimeMessage(session);	 
			
			// header field of the header. 
			message.setFrom(new InternetAddress("from-info@dopeidea.co.za")); 
			
			message.setRecipients(Message.RecipientType.TO, 
				InternetAddress.parse("to-admin@dopeidea.co.za")); 
			message.setSubject("hello"); 
			message.setText("Yo it has been sent"); 

			Transport.send(message);		 //send Message 

			System.out.println("Done"); 

		} catch (MessagingException e) { 
			throw new RuntimeException(e); 
		} 
	} 
} 