package selenium;

//import java.security.NoSuchProviderException;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

import com.google.common.util.concurrent.CheckedFuture;

//import org.junit.jupiter.api.extension.ExtensionContext.Store;
//import org.openqa.selenium.remote.server.Session;

public class ReadEmail {
	
	public static void read(String host, String storeType, String username, String Password) {
		
		try {
			
			Properties properties = new Properties();
			
			properties.put("mail.pop3.host", host);
			properties.put("mail.pop3.port", "995");
			properties.put("mail.pop3.starttls.enable", "true");
			
			 properties.setProperty("mail.store.protocol", "imaps");
			
			Session emailSession = Session.getDefaultInstance(properties);
			Store store = emailSession.getStore("pop3s");
			
			Folder emailFolder = store.getFolder("INBOX");
			emailFolder.open(Folder.READ_ONLY);
			
			Message messages[] = emailFolder.getMessages();
			
			int i = ((messages.length)-1);
			
			Message message = messages[1];
			
			System.out.println("Email Number " + (i + 1));
			System.out.println("Subject: " + message.getSubject());
			System.out.println("From: " + message.getFrom());
//			System.out.println("Content "+ message.getContent());
			
			emailFolder.close(true);
			store.close();
			
			
		} catch (NoSuchProviderException e) { System.out.println("error1 " + e.getMessage());// TODO: handle exception 
		}catch (MessagingException e) { System.out.println("error2 " + e.getLocalizedMessage()); // TODO: handle exception
		}catch (Exception e) {  System.out.println("error3 " + e.getMessage());// TODO: handle exception
			
		}
				
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String host = "mail.dopeidea.co.za";
		String storeType = "pop3";
		String username = "admin@dopeidea.co.za";
		String password = "mail.dopeidea.co.za";
		
	read(host, storeType, username, password);
	}

}
