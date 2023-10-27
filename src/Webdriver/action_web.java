package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_web 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		driver.manage().window().maximize();
		
		//drag & drop
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']//p"));	 
		WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));		
		Actions action = new Actions(driver);   
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		

	}

}
