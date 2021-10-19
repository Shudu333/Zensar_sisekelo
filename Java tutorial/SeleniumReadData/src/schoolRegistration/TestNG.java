package schoolRegistration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	

	public String baseUrl = "https://facebook.com";
	String driverpath = "C:\\selenium\\chromedriver.exe";
    public WebDriver driver;
    
    @BeforeTest
    public void login() {
    	
    	
    	
//    	ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("--disable-notifications"); //to disable allow notification pop-up
//		WebDriver driver = new ChromeDriver(opt);
//		
    	 System.setProperty("webdriver.chrome.driver", driverpath);
         driver = new ChromeDriver();
         driver.get(baseUrl); 
         
         driver.findElement(By.id("email")).sendKeys("0749903447");
         
        driver.findElement(By.id("pass")).sendKeys("Group3",Keys.ENTER); // Correct Password
	}
    
    
//    @Test
//    public void status() throws InterruptedException {
//    	
//    	
//         
//         
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")).click();     
//         Thread.sleep(5000); // click home icon to load news feed
//
//                                       
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span")).click();
//         Thread.sleep(3000); // click status Text box
//         
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div"
//         		+ "/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div")).sendKeys("Dont Stop until you find a way ",Keys.ENTER);
//         Thread.sleep(3000);    // Write your status 
//         
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div/span/img")).click();
//         Thread.sleep(3000); // Select status Background
//        
//     
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div[4]/div/div")).click();
//         Thread.sleep(3000); // Choose status Background
//         
//         
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div/div[3]/div/div/div/span/div/div/div[1]/div/div/div/i")).click();
//         Thread.sleep(3000); // select to add emoji
//        
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div/div/div/div/div[2]/div/div[10]/span[5]/div/img")).click();  
//         Thread.sleep(1000); // Choose emoji
//   
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div/div/div/div/div[2]/div/div[10]/span[3]/div/img")).click();
//         Thread.sleep(1000); // Choose emoji
//   
//         
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/span[7]/div/img")).click();
//         Thread.sleep(3000); // Choose emoji
//
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div/div[1]")).click();
//         Thread.sleep(10000); // upload status
//		
//	}
//    
  
    @Test
    public void search() throws InterruptedException {
    	
    	
    	
		 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("McNificent DatGuy BabyFace",Keys.ENTER);
         Thread.sleep(5000);
         
		
	}
	        
      
		
}

