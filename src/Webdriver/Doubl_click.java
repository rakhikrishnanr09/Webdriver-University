 package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubl_click 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		driver.manage().window().maximize();
		//double click the button to launch double click menu options
				Actions ac=new Actions(driver);
				WebElement link=driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
				ac.doubleClick(link).perform();
		
	}

}
