package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class todo_list 
{

	public static void main(String[] args)
	{
		// create a path for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//create an instance for webdriver
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
		WebElement addnewtodo=driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		addnewtodo.sendKeys("mock test"+ "\n");
		WebElement addnewtodo1=driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		addnewtodo1.sendKeys("Software testing"+ "\n");
		WebElement delete=driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[2]/span/i"));
		delete.click();
		//WebElement plus=driver.findElement(By.xpath("//*[@id=\"plus-icon\"]"));
		//plus.click();
	
		

	}

}
