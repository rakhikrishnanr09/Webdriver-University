package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajax_loader 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		driver.manage().window().maximize();
		WebElement clickme1=driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/p"));
		clickme1.click();
		//WebElement clickmeclose=driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
		//clickmeclose.click();
		
	}

}
