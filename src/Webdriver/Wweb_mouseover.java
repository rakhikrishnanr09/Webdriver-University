package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wweb_mouseover 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html#");
		driver.manage().window().maximize();
		//mouse over1
		//Actions ac=new Actions(driver);
		//WebElement live=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		//ac.moveToElement(live).build().perform();
		//WebElement appautomate=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div"));
		//appautomate.click();
		
		//mouse over2
		//Actions ac2=new Actions(driver);
		//WebElement live2=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/button"));
		//ac2.moveToElement(live2).build().perform();
		//WebElement appautomate2=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/div"));
		//appautomate2.click();
		
		//mouse over3
		//Actions ac3=new Actions(driver);
		//WebElement live3=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));
		//ac3.moveToElement(live3).build().perform();
		//WebElement appautomate3=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div"));
		//appautomate3.click();
		Actions ac4=new Actions(driver);
		WebElement live4=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));
		ac4.moveToElement(live4).build().perform();
		WebElement appautomate4=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div/a[2]"));
		appautomate4.click();
		//WebElement okbutton=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/div"));
		//okbutton.click();

	}



	}


