package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_datepicker
{

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.manage().window().maximize();
		String month="January 2002";
		@SuppressWarnings("unused")
		String day="4";
		WebElement datepickerInput=driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
		datepickerInput.click();
		Thread.sleep(2000);
		while(true)
		{
			//give the xpath of month-year 
			String monthyeartext=driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if(monthyeartext.equals(month)) 
			{
				break;
			}
			else 
			{
			//xpath of left arrow
				WebElement leftarrow=driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[1]"));
				leftarrow.click();
			}
		}
		
		//xpath of day
		WebElement day1=driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[1]/td[6]"));
		day1.click();

	}

}
