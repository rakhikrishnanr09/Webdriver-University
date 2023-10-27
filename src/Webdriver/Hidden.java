package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com");
		driver.manage().window().maximize();
		WebElement hidden=driver.findElement(By.xpath("//*[@id=\"hidden-elements\"]/div/div[1]/h1"));
		hidden.click();

	}

}
