package seleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest{
	
	@Test
	public void readData()
	{
		driver.get("https://www.w3schools.com/sql/sql_syntax.asp");
		
		List<WebElement> tablerows=driver.findElements(By.xpath("//table[@class='ws-table-all notranslate']/tbody/tr"));
		
		for(WebElement tr:tablerows)
		{
			List<WebElement> tableData=tr.findElements(By.tagName("td"));
			for(WebElement td:tableData)
				System.out.println(td.getText());
			System.out.println("***********");
		}
		
	}

}
