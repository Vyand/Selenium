package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ThengaScript 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
		//Open application
		driver.navigate().to("https://bohlokoa-online-shop.herokuapp.com/");
		driver.manage().window().maximize();
		
		//Select navigation link
		WebElement Log = driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[1]/a"));
		Log.click();
		Thread.sleep(1000);
		//Actions action = new Actions(driver);
		//action.moveToElement(Log).perform();
		
		//Locate username field
		WebElement Email = driver.findElement(By.cssSelector("#email"));
		Email.sendKeys("thokozani.simelani@zensar.com");
		Thread.sleep(1000);
				
		//Locate password field
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("bee123456");
		Thread.sleep(1000);
		
		//Log In
		WebElement login = driver.findElement(By.className("btn"));
		login.click();
		
		//Locate add to cart button
		WebElement add = driver.findElement(By.className("btn"));
		add.click();
		
		//Proceed to cart
		WebElement cart = driver.findElement(By.className("btn"));
		cart.click();
	}

}
