package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BetScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        //driver.get("https://www.betway.com");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				
				//Open betway
				driver.navigate().to("https://www.betway.co.za");
				driver.manage().window().maximize();
				
				//Locate phone number text
				WebElement phone_number = driver.findElement(By.cssSelector("#MobileNumber"));
				phone_number.sendKeys("0799165729");
				Thread.sleep(1000);
				
				//Locate password text
				WebElement password = driver.findElement(By.cssSelector("#Password"));
				password.sendKeys("Vyand0123");
				Thread.sleep(1000);
				
				driver.findElement(By.cssSelector("#toast-4fed9b82-e84c-4fa9-8d63-c539be37fb04 > div > div > div > div:nth-child(2) > div > div:nth-child(3) > a")).click();
				
				//Locate phone number text
				WebElement phone_number2 = driver.findElement(By.cssSelector("#menuMobileNumber"));
				phone_number2.sendKeys("0799165729");
				Thread.sleep(1000);
						
				//Locate password text
				WebElement password2 = driver.findElement(By.cssSelector("#menuPassword"));
				password2.sendKeys("Vyand0123");
				Thread.sleep(1000);
						
				driver.findElement(By.cssSelector("#mobileLoginBtn")).click();

	}

}
