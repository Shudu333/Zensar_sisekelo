package testNG;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Adactin {
	
	public String baseUrl = "http://adactinhotelapp.com/";
	String driverpath = "C:\\selenium\\chromedriver.exe";
    public WebDriver driver;
    
    @BeforeTest
    public void login() {
    	
    	 System.setProperty("webdriver.chrome.driver", driverpath);
         driver = new ChromeDriver();
         driver.get(baseUrl); 
         
         WebElement email = driver.findElement(By.id("username")); 
         WebElement password = driver.findElement(By.id("password")); 
         WebElement login = driver.findElement(By.id("login")); 
         
         email.sendKeys("Refilwe94");
         password.sendKeys("123456");
         login.click();
		
	}
    
    
    @Test
    public void checkDate() throws InterruptedException, IOException {
    	
    	//To verify whether the check-out date field accepts a before date than check-in date.
    	WebElement location = driver.findElement(By.id("location")); 
        WebElement hotels = driver.findElement(By.id("hotels")); 
        WebElement roomType = driver.findElement(By.id("room_type")); 
        WebElement numberOfRooms = driver.findElement(By.id("room_nos")); 
        WebElement checkInDate = driver.findElement(By.id("datepick_in")); 
        WebElement checkOutDate = driver.findElement(By.id("datepick_out")); 
        WebElement udult = driver.findElement(By.id("adult_room")); 
        WebElement children = driver.findElement(By.id("child_room")); 
        WebElement search = driver.findElement(By.id("Submit")); 
		
       
        
        location.sendKeys("Sydney");
        Thread.sleep(1000);
        hotels.sendKeys("hotel creek");
        Thread.sleep(1000);
        roomType.sendKeys("standard");
        Thread.sleep(1000);
        numberOfRooms.sendKeys("1");
        Thread.sleep(1000);
        checkInDate.clear();
        checkInDate.sendKeys("09/25/2021");
        Thread.sleep(1000);
        checkOutDate.clear();
        checkOutDate.sendKeys("09/23/2021");
        Thread.sleep(1000);
        udult.sendKeys("2");
        Thread.sleep(1000);
        children.sendKeys("0");
        search.click();
        
        Thread.sleep(3000);
        
        File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
        FileUtils.copyFile(screenshot1, new File("C:\\Users\\Ndou\\Desktop\\screen\\"+"Screen"+"1.png"));
        
	}
  
    
    @Test
    public void checkDates() throws InterruptedException, IOException {
    	
    	
    	WebElement location = driver.findElement(By.id("location")); 
        WebElement hotels = driver.findElement(By.id("hotels")); 
        WebElement roomType = driver.findElement(By.id("room_type")); 
        WebElement numberOfRooms = driver.findElement(By.id("room_nos")); 
        WebElement checkInDate = driver.findElement(By.id("datepick_in")); 
        WebElement checkOutDate = driver.findElement(By.id("datepick_out")); 
        WebElement udult = driver.findElement(By.id("adult_room")); 
        WebElement children = driver.findElement(By.id("child_room")); 
        WebElement search = driver.findElement(By.id("Submit")); 
		
        
        location.sendKeys("Sydney");
        Thread.sleep(1000);
        hotels.sendKeys("hotel creek");
        Thread.sleep(1000);
        roomType.sendKeys("standard");
        Thread.sleep(1000);
        numberOfRooms.sendKeys("1");
        Thread.sleep(1000);
        checkInDate.clear();
        checkInDate.sendKeys("09/25/2021");
        Thread.sleep(1000);
        checkOutDate.clear();
        checkOutDate.sendKeys("09/29/2021");
        Thread.sleep(1000);
        udult.sendKeys("1");
        Thread.sleep(1000);
        children.sendKeys("0");
        Thread.sleep(1000);
        search.click();
        
        Thread.sleep(3000);
        File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); 
        FileUtils.copyFile(screenshot1, new File("C:\\Users\\Ndou\\Desktop\\screen\\"+"Screen"+".png"));
	}
    
 
  @AfterTest
  public void logout() {
	  
	  WebElement logout = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")); 
	  logout.click();
	
}

}
