package TestNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.*;

public class IgniteNG {

	public WebDriver driver;

	@BeforeTest
	public void config() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test
	public void login() throws InterruptedException, IOException {
		driver.navigate().to("https://igniteflix.co.za/user/login");
		driver.findElement(By.id("login_email")).sendKeys("group1@yahoo.com");
		driver.findElement(By.id("login_password")).sendKeys("@King007");
		driver.findElement(By.cssSelector("#submit-btn")).click();
		Thread.sleep(3000);

		//ScreenShot of User Profile
		TakesScreenshot screen = (TakesScreenshot) driver;
		File source = screen.getScreenshotAs(OutputType.FILE);

		String ScreenshotName = "Screenshot1";
		FileHandler.copy(source, new File("/Users/Lunge/Downloads/" + ScreenshotName + ".jpeg"));
		System.out.println("Screenshot taken");
	}

	@Test
	public void password() {
		//Change passwordT7------
		driver.navigate().to("https://igniteflix.co.za/my-account/profile");
		driver.findElement(By.xpath("//*[@id=\"section-opt\"]/div/div/div/div/div[1]/div/ul/li[6]/a")).click();
		WebElement old = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/form/div[1]/div/input"));
		old.sendKeys("@King007");
		WebElement newone = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/form/div[2]/div/input"));
		newone.sendKeys("@Queen007");
		WebElement confirm = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/form/div[3]/div/input"));
		confirm.sendKeys("@Queen007");
	}

	@Test
	public void userUpdate() throws InterruptedException {
		
		// Update User Profile PictureT4
		driver.navigate().to("https://igniteflix.co.za/user/profile");
		driver.findElement(By.xpath("//*[@id=\"section-opt\"]/div/div/div/div/div[2]/div[2]/div[2]/div[6]/a")).click();
		driver.findElement(By.cssSelector("#avatar")).sendKeys("C:\\Users\\Lunge\\Downloads\\pic.jpeg");
		//change phone number
		WebElement phoneNumb = driver.findElement(By.cssSelector("#phone"));
		phoneNumb.clear();
		phoneNumb.sendKeys("067299992");
		Thread.sleep(1000);
		//DOB
		WebElement DOB = driver.findElement(By.cssSelector("#dob"));
		DOB.clear();
		DOB.sendKeys("1996-02-29");
		Thread.sleep(1000);
		//Save Changes
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/form/div[7]/div/button")).click();
		Thread.sleep(1000);
		driver.navigate().to("https://igniteflix.co.za/my-account/profile");
	}

	@Test
	public void viewMovies() throws InterruptedException {

		//Search and play movieT6
		driver.navigate().to("https://igniteflix.co.za/");
		driver.findElement(By.id("search-input")).sendKeys("Black Thursday");
		driver.findElement(By.xpath("//*[@id=\"imaginary_container\"]/div/span/button")).click();
		driver.findElement(By.xpath("//*[@id=\"section-opt\"]/div/div/div/div/div/div/div/div/div/div[3]/h3/a")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("#play > div:nth-child(1) > div")).click();
	}

	@AfterTest
	public void Logout() throws InterruptedException {
		//LogOutT3
		driver.navigate().to("https://igniteflix.co.za");
		driver.findElement(By.xpath("//*[@id=\"body-search\"]/div[3]/div/div/p[2]/a[2]")).click();
		Thread.sleep(1000);
		driver.close();
	}
}