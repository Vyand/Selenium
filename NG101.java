package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NG101 {

	public String baseUrl = "https://zensar.com/";
	public WebDriver driver;

	@BeforeTest
	public void launchSite() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		System.out.println("launched zensar site");
		driver.get(baseUrl);
	}

	@Test
	public void verifyPageTitle() {
		String expectedTitle = "Zensar - Think Velocity";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
