package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Inherit {

	public String baseUrl = "https://igniteflix.co.za/user/login";
	String driverpath = "C:\\selenium\\chromedriver.exe";
    public WebDriver driver;
    
    @Test
    public void login() {
    	
    	 System.setProperty("webdriver.chrome.driver", driverpath);
         driver = new ChromeDriver();
         driver.get(baseUrl); 
         
         WebElement email = driver.findElement(By.id("login_email")); 
         WebElement password = driver.findElement(By.id("login_password")); 
         WebElement login = driver.findElement(By.id("submit-btn")); 
         
         email.sendKeys("m@m.com");
         password.sendKeys("Wilton123?");
         login.click();
         
    }

	}

@Test
	class compare extends Inherit {
	 
		public void results() {
			String expectedTitle = "Manage Profile";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle);
		}
		 
	  
	  
	 
	}