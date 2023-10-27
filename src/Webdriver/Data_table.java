package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Data_table
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Data-Table/index.html#");
		driver.manage().window().maximize();
		WebElement first=driver.findElement(By.xpath("//*[@id=\"form-textfield\"]/input[1]"));
		first.sendKeys("Rakhi");
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"form-textfield\"]/input[2]"));
		lastname.sendKeys("Krishnan");
		WebElement comments=driver.findElement(By.xpath("//*[@id=\"form-textfield\"]/textarea"));
		comments.sendKeys("Software Testing");
		WebElement home=driver.findElement(By.xpath("/html/body/div/div[3]/div/nav/ol/li[1]/a"));
		home.click();
		WebElement pagination=driver.findElement(By.xpath("/html/body/div/div[5]/div/nav/ul/li[5]/a"));
		pagination.click();
		WebElement submit=driver.findElement(By.xpath("/html/body/div/div[7]/div/div[1]/input[2]"));
		submit.click();
		WebElement button2=driver.findElement(By.xpath("/html/body/div/div[7]/div/div[3]/div/button[2]"));
		button2.click();

	}

}
