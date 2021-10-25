package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mscript {
	
	public String baseUrl = "https://www.facebook.com/";
	public String driverPath = "C:\\Selenium\\chromedriver.exe";
	
	public WebDriver driver;
	
	@BeforeTest
	public void beforetetst() {
		System.out.println("before test");
	}
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
	}
	
	
	@AfterTest
	public void afterTest() {
		
		
		driver.close();
		System.out.println("after test");
	}

}
