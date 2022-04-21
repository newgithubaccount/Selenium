package seleniumTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionsClasstEST extends BaseTest{
	
	@Test
	public void demoTest()
	{
		driver.get("https://facebook.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("dummyd411@gmail.com",Keys.TAB);
		Actions actions=new Actions(driver);
		actions.moveToElement(username);
		actions.contextClick();
		actions.dragAndDrop(username, username);
		actions.moveToElement(username).doubleClick().build().perform();
		sleep();
		/*driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30000));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("month"))));
		WebElement monthd=driver.findElement(By.id("month"));
		Actions actions=new Actions(driver);
		actions.moveToElement(monthd);
		actions.contextClick();*/
		System.out.println();
	}

}
