package Selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


	public class MainClass 
	{

		public static void main(String[] args) throws InterruptedException 
		{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.navigate().to("https://bohlokoa-online-shop.herokuapp.com/");
	//driver.manage().window().maximize();
	
	WebElement nav = driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[1]/a"));
	nav.click();
	Thread.sleep(3000);
	
	WebElement email = driver.findElement(By.cssSelector("#email"));
	email.sendKeys("thokozani.simelani@zensar.com");
	Thread.sleep(3000);
	
	WebElement password = driver.findElement(By.cssSelector("#password"));
	password.sendKeys("bee13456");
	Thread.sleep(3000);
	//login
	WebElement login = driver.findElement(By.className("btn"));
	login.click();
	Thread.sleep(3000);
	
	try
	{
		TakesScreenshot screen = (TakesScreenshot)driver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		
		String ScreenshotName = "Screenshot1";
		FileHandler.copy(source, new File("/Users/Lunge/Downloads/" + ScreenshotName + ".jpeg"));
		System.out.println("Screenshot taken");	
		
	}
	catch(Exception e)
	{
		System.out.println("problem " + e.getMessage());
	}

	}
}