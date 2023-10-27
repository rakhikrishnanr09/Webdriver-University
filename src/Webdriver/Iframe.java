package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
		//WebElement scroll=driver.findElement(By.xpath("//*[@id=\"carousel-example-generic\"]/a[2]/span"));
		//scroll.click();
		//WebElement findoutmore =driver.findElement(By.xpath("//*[@id=\"button-find-out-more\"]/b"));
		//findoutmore.click();
		WebElement products =driver.findElement(By.xpath("/html/body/div[1]/div/div/nav/div/ul/li[2]/a"));
		products.click();

	}

}
