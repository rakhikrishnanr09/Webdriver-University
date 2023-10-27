package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Click 
{

	public static void main(String[] args)
	{
		//create path for chromedriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//create an instance for webdriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		//WebElement clickxpath=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		//clickxpath.click();
		//WebElement javaclick=driver.findElement(By.xpath("//*[@id=\"button2\"]"));
		//javaclick.click();
		WebElement actionmove=driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		actionmove.click();
		
		
	}

}
