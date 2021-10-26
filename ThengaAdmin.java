package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThengaAdmin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://bohlokoa-online-shop.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://bohlokoa-online-shop.herokuapp.com/login");
		driver.findElement(By.id("email")).sendKeys("kgosaneli@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234five");
		driver.findElement(By.className("btn")).click();
		
		driver.navigate().to("https://bohlokoa-online-shop.herokuapp.com/admin/add-product");
		driver.findElement(By.id("title")).sendKeys("real laptop, trust me");
		driver.findElement(By.name("image")).sendKeys("C:\\Users\\Lunge\\Downloads\\mac.jpg");
		driver.findElement(By.name("price")).sendKeys("19000");
		driver.findElement(By.name("description")).sendKeys("this is a real laptop, macbook 16, latest model, this is not a scam.");
		driver.findElement(By.className("btn")).click();

	}

}
