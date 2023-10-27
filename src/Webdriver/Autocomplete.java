package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.manage().window().maximize();
		WebElement fooditem=driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
		fooditem.sendKeys("fruit");
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		submit.click();
		

	}

}
