package Selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Script101 {

public static void main(String[] args) throws InterruptedException, IOException {

	//Creating reference of Webdriver Interface
	WebDriver driver;

	//Declare Twitter Credentials
	String user="";
	String pass="";

	//Creating an instance of chrome
	ChromeOptions coptions = new ChromeOptions();

	// Telling Selenium to find Chrome Driver
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	// Initialize browser
	driver = new ChromeDriver(coptions);

	// Launch Twitter
	driver.get("http://twitter.com/login");

	//Maximize Window
	driver.manage().window().maximize();

	//Wait Till Username Field is displayed
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@placeholder='Phone, email or username']")));

	//Enter Username
	WebElement userTextField = driver.findElement(By.xpath(".//input[@placeholder='Phone, email or username']"));
	userTextField.sendKeys(user);

	//Enter Password
	WebElement PassTextField = driver.findElement(By.xpath(".//input[@class='js-password-field']"));
	PassTextField.sendKeys(pass);

	//Click on Login button
	driver.findElement(By.xpath(".//button[@type='submit']")).click();

	//Wait
	//Thread.sleep(3000);

	//Find the Tweet Box and enter the Tweet 
	WebElement tweetBox = driver.findElement(By.id("tweet-box-home-timeline"));
	tweetBox.click();
	tweetBox.sendKeys("Good Morning World");

	//Click on Tweet Button
	driver.findElement(By.xpath(".//button[@class='tweet-action EdgeButton EdgeButton--primary js-tweet-btn']")).click();

	//Wait
	Thread.sleep(2000);

	// Take Screenshot for Evidence
	File srce = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	// Save the screenshot in the given path by the name Tweet.png
	Files.copy(srce, new File("/Users/Lunge/Desktop/Screenshots/.png"));

	//Click on Profile and Settings
	driver.findElement(By.id("user-dropdown-toggle")).click();

	//Wait and Click Logout Button
	WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.id("signout-button")));
	logout.click();

	//Wait
	Thread.sleep(2000);

	// Close the browser
	driver.quit();
	}
}



