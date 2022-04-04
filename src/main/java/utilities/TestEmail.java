package utilities;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class TestEmail {
	
	public static void main(String[] args ) throws Exception {
		System.out.println("Email started");
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("kguar14@gmail.com", "Pihu@1234"));
		email.setSSLOnConnect(true);
		email.setFrom("kguar14@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("kguar14@gmail.com");
		email.send();
		System.out.println("Email sent");
	}

}
