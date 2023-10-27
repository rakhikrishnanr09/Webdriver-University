package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_hold
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		driver.manage().window().maximize();
		
		//right click the button to launch right click menu options
		
				Actions righ=new Actions(driver);
				WebElement  link=driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
				righ.contextClick(link).perform();

	}

}
