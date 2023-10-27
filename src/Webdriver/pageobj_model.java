package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageobj_model 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Page-Object-Model/index.html");
		driver.manage().window().maximize();
		//WebElement whoareweclick=driver.findElement(By.xpath("//*[@id=\"button-find-out-more\"]/b"));
		//whoareweclick.click();
		WebElement ourproduct=driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[2]/a"));
		ourproduct.click();
		//WebElement offer=driver.findElement(By.xpath("//*[@id=\"container-special-offers\"]/div[1]/p"));
		//offer.click();
		//WebElement camera=driver.findElement(By.xpath("//*[@id=\"container-product1\"]/div[1]/p"));
		//camera.click();
		//WebElement camera=driver.findElement(By.xpath("//*[@id=\"container-product2\"]/div[1]/p"));
		//camera.click();
		//WebElement laptop=driver.findElement(By.xpath("//*[@id=\"container-product1\"]/div[1]/p"));
		//laptop.click();
		//WebElement usedlaptop=driver.findElement(By.xpath("//*[@id=\"container-product1\"]/div[1]/p"));
		//usedlaptop.click();
		//WebElement gameconsoles=driver.findElement(By.xpath("//*[@id=\"container-product1\"]/div[1]/p"));
		//gameconsoles.click();
		//WebElement compononts=driver.findElement(By.xpath("//*[@id=\"container-product1\"]/div[1]/p"));
		//compononts.click();
		//WebElement desktop=driver.findElement(By.xpath("//*[@id=\"container-product6\"]/div[1]/p"));
		//desktop.click();
		//WebElement audio=driver.findElement(By.xpath("//*[@id=\"container-product7\"]/div[1]/p"));
		//audio.click();
		WebElement contact=driver.findElement(By.xpath("//*[@id=\"div-main-nav\"]/div/ul/li[3]/a"));
		contact.click();
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		firstname.sendKeys("Rakhi");
		WebElement lastname=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
		lastname.sendKeys("Krishnan R");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		email.sendKeys("rakhikrishnanr709@gmail.com");
		WebElement comments=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		comments.sendKeys("Iam a Btech Graduate.I want to know the details of Automation course");
		//WebElement reset=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
		//reset.click();
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		submit.click();
		
		
	}

}
