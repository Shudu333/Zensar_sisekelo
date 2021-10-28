package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import constants.Constants;
import constants.Excel;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;




public class TCLogin {
	
	
static Excel excelUtils = new Excel();
    
    
static String excelFilePath =Constants.Path_TestData+Constants.excelFilePath;
	 public String baseUrl = "https://www.woolworths.co.za/";
		String driverpath = "C:\\selenium\\chromedriver.exe";
	    public WebDriver driver;
	    
	    
	    @BeforeTest
	    public void launch() {
	    	
	   	 System.setProperty("webdriver.chrome.driver", driverpath);
	     driver = new ChromeDriver();
	     driver.get(baseUrl); 
	    }



//@Test
//public void login() throws IOException, InterruptedException {
//
//	  //Creating object of home page
//	HomePage home = new HomePage(driver);
//	LoginPage login = new LoginPage(driver);
//	
//	RegistrationPage register = new RegistrationPage(driver);
//	
//	
//
//	//Click on Login button
//	
//			home.clickLogin();
//		
//			
//			excelUtils.setExcelFile(excelFilePath,"Sheet1");
//			
//			for(int i=1;i<=excelUtils.getRowCountInSheet();i++)
//	        {
//	        	Thread.sleep(1000);
//	        	
//	        	login.enterUsername(excelUtils.getCellData(i,3));
//	        	
//				login.enterPassword(excelUtils.getCellData(i,5));
//	        	
//	        	
//				//Click on login button
//				login.clickLogin();
//	        	
////	        	Thread.sleep(1000);
////	          	JavascriptExecutor js = (JavascriptExecutor) driver;
////	        	js.executeScript("arguments[0].click();", login.);
//	        	 
//
//	        	Thread.sleep(5000);
//	        	         	
//	        	WebElement errormsg = driver.findElement(By.xpath("//div[@class='text-small message message--error']"));
//	        	
//	        	Thread.sleep(1000);
//	        	 if (errormsg.isDisplayed() ) {
//	              	
//	              	excelUtils.setCellValue(i,11,"PASS",excelFilePath);
//	              } else {
//	                  
//	                  excelUtils.setCellValue(i,11,"FAIL",excelFilePath);
//	              }
//
//	        	          
//			
//	        }
//	
//		}



@Test
public void register() throws IOException, InterruptedException {
	
	  //Creating object of home page
	HomePage home = new HomePage(driver);
	LoginPage login = new LoginPage(driver);
	RegistrationPage register = new RegistrationPage(driver);
	//Click on Login button
			home.clickLogin();
			home.clickRegister();
			
			excelUtils.setExcelFile(excelFilePath,"Sheet1");
			
			for(int i=1;i<=excelUtils.getRowCountInSheet();i++)
	        {
	        	

	        	
				register.title(excelUtils.getCellData(i,0));
				register.firstName(excelUtils.getCellData(i,1));
				register.lastName(excelUtils.getCellData(i,2));
				register.email(excelUtils.getCellData(i,3));
				register.confirmEmail(excelUtils.getCellData(i,4));
				register.password(excelUtils.getCellData(i,5));
				register.confirmPassword(excelUtils.getCellData(i,6));
				register.contact(excelUtils.getCellData(i,7));
	         	Thread.sleep(1000);
	         	
	         	
				//Click on Register button
				register.clickRegister();
	        	        	

				Thread.sleep(1000);
	         	
	             
	             WebElement errormessage = driver.findElement(By.xpath("//span[@class='form-field__msg form-field__msg--error']"));
	             
	            
	             if (errormessage.isDisplayed() ) {
	             	
	             	excelUtils.setCellValue(i,9,"PASS",excelFilePath);
	             } else {
	                 
	                 excelUtils.setCellValue(i,9,"FAIL",excelFilePath);
	             }

	        	          
			
	        }
	
		}


}
