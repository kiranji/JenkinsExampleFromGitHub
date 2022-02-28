package AppiumExample.Animaker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChrome {
	

	
	@Test
	public void googleSearch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kkrid\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	WebElement ele=	driver.findElement(By.xpath("//*[@name='q']"));
	ele.sendKeys("animaker");
	Thread.sleep(3000);
	String key="animaker software";
	List<WebElement> searchResult=driver.findElements(By.xpath("//*[@role='listbox']/li"));
	for(int i=0;i<searchResult.size();i++) {
		if(searchResult.get(i).getText().equalsIgnoreCase(key)) {
			searchResult.get(i).click();
			Assert.assertEquals(1, 0);
			break;
		}
	}
	driver.quit();
	
	}
}
