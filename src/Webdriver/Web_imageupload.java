package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_imageupload 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		WebElement image=driver.findElement(By.xpath("//*[@id=\"myFile\"]"));
		image.sendKeys("C:\\Users\\rakhi\\Desktop\\New folder\\back.png");
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		submit.click();
	}

}
