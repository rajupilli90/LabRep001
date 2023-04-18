package venkatesh;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class svs {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.get("http://google.com");		
		
//		driver.findElement(By.name("q")).sendKeys("Selenium");
//		Thread.sleep(2000);
//		
//		List<WebElement> keywordlist = driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
//		
//		for(int i=1;i<keywordlist.size();i++)
//		{
//			if(keywordlist.get(i).getText().contains("download"))
//			{
//				keywordlist.get(i).click();
//				break;
//			}
//		}
	driver.get("http://facebook.com");	
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(5);
		
		WebElement melement = driver.findElement(By.id("month"));		
		Select month = new Select(melement);
		month.selectByValue("2");
		
		WebElement yelement = driver.findElement(By.id("year"));
		Select year = new Select(yelement);
		year.selectByVisibleText("2000");
	}

}
