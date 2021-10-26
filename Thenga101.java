package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thenga101 {

	public static void main(String[] args) throws InterruptedException 
	{

		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.navigate().to("https://bohlokoa-online-shop.herokuapp.com/");
		driver.manage().window().maximize();
		
		//Select navigation link
		WebElement Log = driver.findElement(By.xpath("/html/body/header/nav/ul[2]/li[1]/a"));
		Log.click();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.cssSelector("#email"));
		email.sendKeys("thokozani.simelani@zensar.com");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("bee123456");
		Thread.sleep(3000);
		//login
		WebElement login = driver.findElement(By.className("btn"));
		login.click();
		Thread.sleep(3000);
		
		//Add to cart
		WebElement add = driver.findElement(By.xpath("/html/body/main/div/article[2]/div[3]/form/button"));
		add.click();
		Thread.sleep(3000);
		
		//Order now
		WebElement order_now = driver.findElement(By.xpath("/html/body/main/div/a"));
		order_now.click();
		Thread.sleep(3000);
		
		WebElement order = driver.findElement(By.cssSelector("#order-btn"));
		order.click();
		Thread.sleep(3000);
		
		//Payment
		WebElement email_id = driver.findElement(By.cssSelector("#email"));
		email_id.sendKeys("thokozani.simelani@zensar.com");
		
		WebElement card_number = driver.findElement(By.cssSelector("#cardNumber"));
		card_number.sendKeys("4242424242424242");
		WebElement card_expiry = driver.findElement(By.cssSelector("#cardExpiry"));
		card_expiry.sendKeys("04/25");
		WebElement card_cvc = driver.findElement(By.cssSelector("#cardCvc"));
		card_cvc.sendKeys("256");
		WebElement bill_name = driver.findElement(By.cssSelector("#billingName"));
		bill_name.sendKeys("moola");
		WebElement stripe_pass = driver.findElement(By.cssSelector("#enableStripePass"));
		stripe_pass.click();
		WebElement phone = driver.findElement(By.cssSelector("#billingName"));
		phone.sendKeys("0791203949");
		
		WebElement pay = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/form/div[2]/div[5]/button/div[3]"));
		pay.click();

	}

}
