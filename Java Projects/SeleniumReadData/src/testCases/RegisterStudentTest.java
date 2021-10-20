package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Constants;
import utilities.ExcelUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class RegisterStudentTest {
    
	
    static ExcelUtils excelUtils = new ExcelUtils();
    
    
    static String excelFilePath =Constants.Path_TestData+Constants.File_TestData;

    public static  void main(String args[]) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
        
       
        WebDriver driver = new ChromeDriver();
        
        
        driver.get("https://demoqa.com/automation-practice-form");
        
       
        WebElement firstName=driver.findElement(By.id("firstName"));
        WebElement lastName=driver.findElement(By.id("lastName"));
        WebElement email=driver.findElement(By.id("userEmail"));
        WebElement gender= driver.findElement(By.id("gender-radio-1"));
        WebElement mobile=driver.findElement(By.id("userNumber"));
        WebElement address=driver.findElement(By.id("currentAddress"));
        WebElement submitBtn=driver.findElement(By.id("submit"));
        
        
        excelUtils.setExcelFile(excelFilePath,"Sheet1");

        
        for(int i=1;i<=excelUtils.getRowCountInSheet();i++)
        {
        	Thread.sleep(1000);
        	firstName.sendKeys(excelUtils.getCellData(i,0));
        	Thread.sleep(1000);
        	lastName.sendKeys(excelUtils.getCellData(i,1));
        	Thread.sleep(1000);
        	email.sendKeys(excelUtils.getCellData(i,2));
        	Thread.sleep(1000);
        	mobile.sendKeys(excelUtils.getCellData(i,4));
        	Thread.sleep(1000);
        	address.sendKeys(excelUtils.getCellData(i,8));
        	Thread.sleep(1000);
        	
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	js.executeScript("arguments[0].click();", gender); //Click on the gender radio button using javascript
       
        	Thread.sleep(1000);
        	//js.executeScript("arguments[0].click();", submitBtn); //Click on the submit button using javascript 
submitBtn.click();

        
        	Thread.sleep(1000);
            WebElement confirmationMessage = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
            
           
            if (confirmationMessage.isDisplayed()) {
            	
            	excelUtils.setCellValue(i,12,"PASS",excelFilePath);
            } else {
                
                excelUtils.setCellValue(i,12,"FAIL",excelFilePath);
            }

            Thread.sleep(1000);
            WebElement closebtn=driver.findElement(By.id("closeLargeModal"));
            js.executeScript("arguments[0].click();", closebtn); //Click on the close modal button using javascript 
//            closebtn.click();
         
           
            driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        }
        //closing the driver
        driver.quit();
    }
}