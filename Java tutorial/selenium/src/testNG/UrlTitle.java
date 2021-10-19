package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UrlTitle {
	
	public String baseUrl = "https://zensar.com";
	String driverpath = "C:\\selenium\\chromedriver.exe";
    public WebDriver driver;
    
    @BeforeTest
    public void launchSite() {
        System.out.println("launched zensar site");
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
   
    @Test
    public void verifyPageTitle() {
        String expectedTitle = "Zensar - Thin Velocity";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
   
    @AfterTest
    public void terminate() {
        driver.close();
    } 
    
}