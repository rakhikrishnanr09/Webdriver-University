package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		
		//allert
		
		//WebElement alert1=driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		//alert1.click();
		
		//alert2
		

		//WebElement alert2=driver.findElement(By.xpath("//*[@id=\"button2\"]/p"));
		//alert2.click();
		
		//alert3
		

		//WebElement alert3=driver.findElement(By.xpath("//*[@id=\"button3\"]/p"));
		//alert3.click();
		
		//alert4
		

		WebElement alert4=driver.findElement(By.xpath("//*[@id=\"button4\"]/p"));
		alert4.click();
	}

}
