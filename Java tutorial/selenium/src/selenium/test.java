package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test {
WebDriver driver;
public void invokeBrowser() {
try {
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
}
} catch (Exception e) {
e.printStackTrace();
}
}
public void registration() {
try {
{
driver.navigate().to("http://demoqa.com/registration/");
driver.findElement(By.id("name_3_firstname")).sendKeys("eepa");
driver.findElement(By.id("name_3_lastname")).sendKeys("jaini");
//Radio button
driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[2]/div/div/input[1]")).click();
//check box
driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div/input[1]")).click();
driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div/input[2]")).click();
driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[3]/div/div/input[3]")).click();
//drop down
Select country=new Select(driver.findElement(By.id("dropdown_7")));
country.selectByVisibleText("India");
Select month=new Select(driver.findElement(By.id("mm_date_8")));
month.selectByVisibleText("7");
Select day =new Select(driver.findElement(By.id("dd_date_8")));
day.selectByVisibleText("13");
Select year=new Select(driver.findElement(By.id("yy_date_8")));
year.selectByVisibleText("1995");
driver.findElement(By.id("phone_9")).sendKeys("1234567890");
driver.findElement(By.id("username")).sendKeys("deepu123");
driver.findElement(By.id("email_1")).sendKeys("dj123@gmail.com");
Thread.sleep(1000);
//clear the email field
//driver.findElement(By.id("email_1")).clear();
//upload file
WebElement upload=driver.findElement(By.id("profile_pic_10"));
upload.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
driver.findElement(By.name("description")).sendKeys("xyz");
driver.findElement(By.id("password_2")).sendKeys("12345678");
driver.findElement(By.id("confirm_password_password_2")).sendKeys("12345678");
//click on submit button
driver.findElement(By.name("pie_submit")).click();
}
} catch (InterruptedException e) {
e.printStackTrace();
}
}
public static void main(String[] args) {
test obj=new test();
obj.invokeBrowser();
obj.registration();
}
}