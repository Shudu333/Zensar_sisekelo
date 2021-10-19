package readEmails;

import javax.mail.*;

import selenium.ReadEmail;

import java.util.Properties;

public class OutlookEmail {
	 
	public static final String USERNAME = "admin@dopeidea.co.za";
    public static final String PASSWORD = "mail.dopeidea.co.za";

    public static void main(String[] args) throws Exception {
        // 1. Setup properties for the mail session.
        Properties props = new Properties();
        props.put("mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.pop3.socketFactory.fallback", "false");
        props.put("mail.pop3.socketFactory.port", "995");
        props.put("mail.pop3.port", "995");
        props.put("mail.pop3.host", "mail.dopeidea.co.za");
        props.put("mail.pop3.user", OutlookEmail.USERNAME);
        props.put("mail.store.protocol", "pop3");

        // 2. Creates a javax.mail.Authenticator object.
        Authenticator auth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(OutlookEmail.USERNAME, OutlookEmail.PASSWORD);
            }
        };

        // 3. Creating mail session.
        Session session = Session.getDefaultInstance(props, auth);

        // 4. Get the POP3 store provider and connect to the store.
        Store store = session.getStore("pop3");
        store.connect("mail.dopeidea.co.za", OutlookEmail.USERNAME, OutlookEmail.PASSWORD);

        // 5. Get folder and open the INBOX folder in the store.
        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_ONLY);

        // 6. Retrieve the messages from the folder.
        Message[] messages = inbox.getMessages();
        for (Message message : messages) {
            message.writeTo(System.out);
        }

        // 7. Close folder and close store.
        inbox.close(false);
        store.close();
    }
    
}