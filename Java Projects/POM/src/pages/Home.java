package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Home(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locator for login button
	By LoginBtn = By.id("login");
	
	//Method to click login button
	public void clickLogin() {
		driver.findElement(LoginBtn).click();
	}

}
