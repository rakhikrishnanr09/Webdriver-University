package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_radio
{

	public static void main(String[] args)
	{
		//dropdown
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		WebElement drop1=driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]"));
		drop1.click();
		WebElement java=driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]/option[1]"));
		java.click();
		WebElement drop2=driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]"));
		drop2.click();
		WebElement maven=driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]/option[2]"));
		maven.click();
		WebElement drop3=driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]"));
		drop3.click();
		WebElement jquery=driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]/option[4]"));
		jquery.click();
		//checkbox
		WebElement option1=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]/input"));
		option1.click();
		WebElement option2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
		option2.click();
		WebElement option3=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]/input"));
		option3.click();
		WebElement option4=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[4]/input"));
		option4.click();
		//radiobutton
		WebElement radiobuttonpurple=driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[5]"));
		radiobuttonpurple.click();
		
		//selected and disabled
		WebElement selectedpumpkin=driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[3]"));
		selectedpumpkin.click();
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]"));
		dropdown.click();
		WebElement dropdownpear=driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]/option[3]"));
		dropdownpear.click();
		
		//return back to homepage
		WebElement homepage=driver.findElement(By.xpath("//*[@id=\"nav-title\"]"));
		homepage.click();
		
		
		
	}

}
