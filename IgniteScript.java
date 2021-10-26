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

public class IgniteScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		try {
			driver.get("https://igniteflix.co.za/");
			driver.manage().window().maximize();
			Thread.sleep(3000);

			// SignUpT1
			driver.navigate().to("https://igniteflix.co.za/user/login");
			driver.findElement(By.id("name2")).sendKeys("ksjdsjhdjsgdjsgd H");
			driver.findElement(By.id("email2")).sendKeys("group1@yahoo.com");
			driver.findElement(By.id("password")).sendKeys("@King007");
			driver.findElement(By.id("password2")).sendKeys("@King007");
			driver.findElement(By.cssSelector("#submit-btn2")).click();
			Thread.sleep(1000);

			// LogInT2
			driver.navigate().to("https://igniteflix.co.za/user/login");
			driver.findElement(By.id("login_email")).sendKeys("group1@yahoo.com");
			driver.findElement(By.id("login_password")).sendKeys("@King007");
			driver.findElement(By.cssSelector("#submit-btn")).click();
			Thread.sleep(5000);
			// ScreenShot of User Profile
			TakesScreenshot screen = (TakesScreenshot) driver;
			File source = screen.getScreenshotAs(OutputType.FILE);

			String ScreenshotName = "Screenshot1";
			FileHandler.copy(source, new File("/Users/Lunge/Downloads/" + ScreenshotName + ".jpeg"));
			System.out.println("Screenshot taken");

			// LogOutT3
			driver.navigate().to("https://igniteflix.co.za");
			driver.findElement(By.xpath("//*[@id=\"body-search\"]/div[3]/div/div/p[2]/a[2]")).click();
			Thread.sleep(1000);

			// Update User Profile PictureT4
			driver.navigate().to("https://igniteflix.co.za/user/profile");
			driver.findElement(By.xpath("//*[@id=\"section-opt\"]/div/div/div/div/div[2]/div[2]/div[2]/div[6]/a"))
					.click();
			driver.findElement(By.cssSelector("#avatar")).sendKeys("C:\\Users\\Lunge\\Downloads\\pic.jpeg");
			// change phone number
			WebElement phoneNumb = driver.findElement(By.cssSelector("#phone"));
			phoneNumb.clear();
			phoneNumb.sendKeys("079910555");
			Thread.sleep(2000);
			// DOB
			WebElement DOB = driver.findElement(By.cssSelector("#dob"));
			DOB.clear();
			DOB.sendKeys("1996-02-27");
			Thread.sleep(1000);
			// Save Changes
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/form/div[7]/div/button")).click();

			Thread.sleep(1000);
			driver.navigate().to("https://igniteflix.co.za/my-account/profile");

			// Back to view Profile
			driver.findElement(By.xpath("//*[@id=\"section-opt\"]/div/div/div/div/div[1]/div/ul/li[1]/a")).click();
			Thread.sleep(3000);

			// View by genreT5
			driver.findElement(By.cssSelector("#navbar1 > ul.nav.navbar-nav.navbar-left > li:nth-child(2) > a")).click();
			driver.navigate().to("https://igniteflix.co.za/genre/drama.html");

			// Search and play movieT6
			driver.navigate().to("https://igniteflix.co.za/");
			driver.findElement(By.id("search-input")).sendKeys("Black Thursday");
			driver.findElement(By.xpath("//*[@id=\"imaginary_container\"]/div/span/button")).click();
			driver.findElement(By.xpath("//*[@id=\"section-opt\"]/div/div/div/div/div/div/div/div/div/div[3]/h3/a")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"section-opt\"]/div/div/div/div/div/div/div/div/div/div[3]/h3/a")).click();
			driver.navigate().to("https://igniteflix.co.za/");

			// change passwordT7------
			driver.navigate().to("https://igniteflix.co.za/my-account/profile");
			driver.findElement(By.xpath("//*[@id=\"section-opt\"]/div/div/div/div/div[1]/div/ul/li[6]/a")).click();
			WebElement old = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/form/div[1]/div/input"));
			old.sendKeys("@King007");
			WebElement newone = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/form/div[2]/div/input"));
			newone.sendKeys("@Queen007");
			WebElement confirm = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[2]/div[2]/div/form/div[3]/div/input"));
			confirm.sendKeys("@Queen007");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
