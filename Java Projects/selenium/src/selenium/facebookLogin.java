package selenium;

import java.lang.StackWalker.Option;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.events.Event.ID;

@Test
public class facebookLogin {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
	 opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		
		
		 driver.manage().window().maximize();
         driver.get("https://www.facebook.com");
         driver.findElement(By.id("email")).sendKeys("0749903447");
         driver.findElement(By.id("pass")).sendKeys("Group3",Keys.ENTER);
         
 		String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(10000);

        
        
        WebElement element = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).findElement(By.tagName("div"));
        String text = element.getAttribute("id");
       
        System.out.println(text);
        
      
      driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")).click();
      
      Thread.sleep(10000);
      
      
      driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div")).click();
      Thread.sleep(10000);
      
      driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div")).sendKeys("Hello im a new user",Keys.ENTER);

      Thread.sleep(10000);     
      
    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div/span/img")).click();
      
    
  Thread.sleep(10000);
  
  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div[3]/div/div")).click();
      
  
Thread.sleep(10000);

driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div/div[3]/div/div/div/span/div/div/div[1]/div/div/div/i")).click();
  
Thread.sleep(10000);

driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/span[8]/div/img")).click();
  
Thread.sleep(10000);

driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div/div[1]")).click();
  
//Thread.sleep(10000);
//
//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")).click();
//      Thread.sleep(10000);
//        
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")).click();
//        
//        Thread.sleep(10000);
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[2]")).click();
//        
        
        
//        driver.findElement(By.xpath("")).sendKeys("Hello im a new user",Keys.ENTER);
        
      

//         driver.findElement(By.xpath("//*[@id=\""+ text +"\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("McNificent  \"Babyface\" DatGuy",Keys.ENTER);
         
       
//         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("McNificent  \"Babyface\" DatGuy",Keys.ENTER);
	}

}
