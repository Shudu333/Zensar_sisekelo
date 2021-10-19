package readEmails;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class EmailClickDemo {

	@Test
	public void clickEmail() {

		String driverPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ndou\\Desktop\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mail.dopeidea.co.za:2095/");
		GmailPageObjects gp=PageFactory.initElements(driver, GmailPageObjects.class);
		gp.enterEmail("admin@dopeidea.co.za");//Replace with your email id
		gp.enterPassword("mail.dopeidea.co.za");//Replace with your password
		gp.clickEmail("Hello");//Replace with email subject you want to click
		
		
	}
}
