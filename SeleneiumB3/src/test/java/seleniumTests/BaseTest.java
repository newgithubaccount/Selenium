package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
WebDriver driver;
	
	@BeforeMethod
	 public void bsmethod()
	{
		ChromeOptions chr=new ChromeOptions();
		chr.addArguments("start-maximized");
		chr.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver=new ChromeDriver(chr);
	}
	@AfterMethod
	public void  amethod()
	{
		driver.close();
	}
	
	public void sleep()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
