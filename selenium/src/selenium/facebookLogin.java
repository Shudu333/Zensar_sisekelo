package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.events.Event.ID;

public class facebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
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
        
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")).click();
        
        
//        driver.findElement(By.xpath("")).click();
        
        
//        driver.findElement(By.xpath("")).sendKeys("Hello im a new user",Keys.ENTER);
        
      

//         driver.findElement(By.xpath("//*[@id=\""+ text +"\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("McNificent  \"Babyface\" DatGuy",Keys.ENTER);
         
       
         driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("McNificent  \"Babyface\" DatGuy",Keys.ENTER);
	}

}