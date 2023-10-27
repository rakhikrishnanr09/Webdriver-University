package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Portal 
{

	public static void main(String[] args)
	{
		//create path for chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//create an instance for webdriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//*[@id=\"text\"]"));
		username.sendKeys("Rakhi");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Rakhik@123");
		WebElement loginbutton=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		loginbutton.click();
	}

}
