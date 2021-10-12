package selenium;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver(); 
		try {
			
			ChromeDriver driver = new ChromeDriver();
			
			String baseUrl = "www.facebook.com";
			String tagName = "";
//			tagName = driver.findElement(By.id("pass")).getTagName();
			
			driver.get(baseUrl);
			Thread.sleep(3000);
			
			SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
			Date curDate = new Date();
			String strDate = sdf.format(curDate);
			String fileName = "logFile" + strDate;
			File newFile = new File(fileName);
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
//			File source = ts.getScreenshotAs(OutputType.FILE);
			String screenshotName = "screen";
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(src, new File("C:\\Users\\Ndou\\Desktop\\sc\\"+ screenshotName + ".png"));
			
			System.out.println("screenshot taken");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("problem " + e.getMessage());
		}
	}

}
