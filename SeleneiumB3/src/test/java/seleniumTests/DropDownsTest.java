package seleniumTests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownsTest extends BaseTest{
	
	@Test
	public void selectValuesFromDropDown()
	{
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement monthd=driver.findElement(By.id("month"));
		Select select=new Select(monthd);
		select.selectByIndex(5);
		sleep();
		select.selectByValue("8");
		sleep();
		select.selectByVisibleText("Dec");
		sleep();
		List<WebElement> options=select.getOptions();
		for(WebElement option:options)
			System.out.println(option.getText());
		System.out.println(select.getFirstSelectedOption().getText());
		
	}

}
