package selenium;

import javax.swing.text.View;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.util.concurrent.Striped;

public class bohlokoa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		 driver.manage().window().maximize();
         driver.get("https://bohlokoa-online-shop.herokuapp.com/");
         driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[1]/a")).click();
     
//         Shop Login
         driver.findElement(By.id("email")).sendKeys("peterntsuntsha24@gmail.com");
         driver.findElement(By.id("password")).sendKeys("12345Peter",Keys.ENTER);
         Thread.sleep(1000);
         
//         add 
         driver.findElement(By.xpath("/html/body/main/div/article[2]/div[3]/form/button")).click(); //Add to cart Product 2
         
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[2]/a")).click(); //back to shop home page
         Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/main/div/article[1]/div[3]/a")).click();  // View product one details
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/main/form/button")).click(); // Add to cart product one
         Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[2]/a")).click(); // back to Shop home page
         
         Thread.sleep(1000);
         
         driver.findElement(By.xpath("/html/body/main/div/article[3]/div[3]/form/button")).click(); //add to cart product three
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("/html/body/main/ul/li/form/button")).click(); //delete one item from cart
         Thread.sleep(2000);
         
         driver.findElement(By.xpath("/html/body/main/div/a")).click(); // checkout
         Thread.sleep(1000);
      
         driver.findElement(By.id("order-btn")).click(); // Confirm Order
         Thread.sleep(5000);
         

//         Stripe Payment             
         driver.findElement(By.id("email")).sendKeys("peterntsuntsha24@gmail.com");
         driver.findElement(By.name("cardNumber")).sendKeys("4242424242424242");
         driver.findElement(By.id("cardExpiry")).sendKeys("0525");
         driver.findElement(By.id("cardCvc")).sendKeys("123");
         driver.findElement(By.id("billingName")).sendKeys("MP Ndou",Keys.ENTER);
         
         

         Thread.sleep(5000);
           driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li/form/button")).click(); // logout

         
	}

}
