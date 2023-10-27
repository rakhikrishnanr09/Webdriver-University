
package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class accredation 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		driver.manage().window().maximize();
		WebElement manualtesting=driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
		manualtesting.click();
		WebElement manualtestingminimise=driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
		manualtestingminimise.click();
		WebElement cucumberbdd=driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]"));
		cucumberbdd.click();
		WebElement cucumberminimise=driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]"));
		cucumberminimise.click();
		WebElement automation=driver.findElement(By.xpath("//*[@id=\"automation-accordion\"]"));
		automation.click();
		WebElement automationminimise=driver.findElement(By.xpath("//*[@id=\"automation-accordion\"]"));
		automationminimise.click();
		WebElement keepclicking=driver.findElement(By.xpath("//*[@id=\"click-accordion\"]"));
		keepclicking.click();
		//WebElement home=driver.findElement(By.xpath("//*[@id=\"nav-title\"]"));
		//home.click();
	}

}
