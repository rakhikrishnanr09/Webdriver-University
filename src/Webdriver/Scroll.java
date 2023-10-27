package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
		driver.manage().window().maximize();
		
		//Actions ac=new Actions(driver);
		//WebElement live=driver.findElement(By.xpath("//*[@id=\"zone1\"]"));
		//ac.moveToElement(live).build().perform();
		//WebElement entry1=driver.findElement(By.xpath("//*[@id=\"zone2-entries\"]"));
		//entry1.click();
		WebElement entry2=driver.findElement(By.xpath("//*[@id=\"zone3-entries\"]"));
		entry2.click();
	}
}


