package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Us 
{

	public static void main(String[] args)
	{

		// set the path for ChromeDriver Executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rakhi\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        //create a new instance of the ChromeDriver
		 WebDriver driver = new ChromeDriver();
		//navigate to the facebook login page using GET method
		 driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		firstname.sendKeys("Rakhi");
		WebElement last=driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[2]/form/input[2]"));
		last.sendKeys("Krishnan");
		WebElement email=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		email.sendKeys("rakhikrishnanr09@gmail.com");
		WebElement comments=driver.findElement(By.cssSelector("#contact_form > textarea"));
		comments.sendKeys("I am a btech student.I want to know the details of Automation Testing Course");
		//WebElement Resetbutton=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
		//Resetbutton.click();
		WebElement Submit=driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		Submit.click();
	}

}
