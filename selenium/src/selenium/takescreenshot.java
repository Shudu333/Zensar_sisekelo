package selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;


public class takescreenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		  //navigate to url
		 driver.manage().window().maximize();
         driver.get("https://www.facebook.com");
         driver.findElement(By.id("email")).sendKeys("0749903447");
         driver.findElement(By.id("pass")).sendKeys("Group3",Keys.ENTER);
         
// 		String title = driver.getTitle();
//        System.out.println(title);
        Thread.sleep(10000);
        
        
        
        WebElement element = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).findElement(By.tagName("div"));
        String text = element.getAttribute("id");
       
        System.out.println(text);
        
        driver.findElement(By.xpath("//*[@id=\""+ text +"\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("McNificent  \"Babyface\" DatGuy",Keys.ENTER);
        
        Thread.sleep(10000);
       //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        //closing the webdriver
        driver.close();
	}

}