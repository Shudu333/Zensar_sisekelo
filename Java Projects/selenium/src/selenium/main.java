package selenium;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		String baseUrl = "http://bluemoney.online/";
        String expectedTitle = "BlueMoney Business Wallet";
        String actualTitle = "";

 

        // launch Chrome and direct it to the Base URL
        driver.get(baseUrl);

 

        // get the actual value of the title
        actualTitle = driver.getTitle();

 

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Chrome
        driver.close();
	}

}
