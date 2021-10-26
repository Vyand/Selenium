package DataDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Utilities.ExcelUtils;
import Utilities.Constants;

public class DataDriven101
{
	static ExcelUtils excelUtils = new ExcelUtils();
	static String path_TestData = Constants.path_TestData+Constants.testData;
	
	public WebDriver driver;
	

	@BeforeTest
	public void config() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/*@Test
	public void SignUp() throws InterruptedException, IOException 
	{
		
		driver.navigate().to("https://igniteflix.co.za/");
		driver.navigate().to("https://igniteflix.co.za/user/login");
		WebElement name = driver.findElement(By.id("name2"));
		WebElement email =driver.findElement(By.id("email2"));
		WebElement password =driver.findElement(By.id("password"));
		WebElement confirm =driver.findElement(By.id("password2"));
		WebElement btnSubmit =driver.findElement(By.cssSelector("#submit-btn2"));
		Thread.sleep(1000);
		
		excelUtils.setFile(path_TestData, "TestData");
		
		for(int x=1; x<=excelUtils.get_rowCount(); x++)
		{
			
			name.clear();
			name.sendKeys(excelUtils.getCellData(x, 0));
			Thread.sleep(500);
			email.clear();
			email.sendKeys(excelUtils.getCellData(x, 1));
			password.clear();
			password.sendKeys(excelUtils.getCellData(x, 2));
			Thread.sleep(500);
			confirm.clear();
			confirm.sendKeys(excelUtils.getCellData(x, 3));
			Thread.sleep(500);

			btnSubmit.click();	
			
			WebElement msg = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div/div[2]/form/ul/li"));
			WebElement msg1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div/div[2]/form/ul[1]/li"));
			WebElement msg2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div/div[2]/form/ul[1]/li"));
		
		if(msg.isDisplayed() || msg1.isDisplayed() || msg2.isDisplayed()){
			excelUtils.setCell(x, 6, "Pass", path_TestData);
			}else{
			excelUtils.setCell(x, 7, "Fail", path_TestData);
			}
		}
	}*/
	@Test
	public void LogIn() throws InterruptedException, IOException 
	{
		
		
		driver.navigate().to("https://igniteflix.co.za/user/login");
		
		WebElement Log_email =driver.findElement(By.id("login_email"));
		WebElement Log_password =driver.findElement(By.id("login_password"));
		WebElement btnSubmit1 =driver.findElement(By.cssSelector("#submit-btn"));
		Thread.sleep(1000);
		
		excelUtils.setFile(path_TestData, "TestData");
		
		for(int x=1; x<=excelUtils.get_rowCount(); x++)
		{
			
			Log_email.clear();
			Log_email.sendKeys(excelUtils.getCellData(x, 1));
			Log_password.clear();
			Log_password.sendKeys(excelUtils.getCellData(x, 2));
			
			Thread.sleep(500);

			btnSubmit1.click();	
			
		WebElement msg = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div/div[2]/form/ul/li"));
		WebElement msg1 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div/div[2]/form/ul[1]/li"));
		WebElement msg2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div/div[2]/form/ul[1]/li"));
		
		if(msg.isDisplayed() || msg1.isDisplayed() || msg2.isDisplayed()){
			excelUtils.setCell(x, 6, "Pass", path_TestData);
			}else{
			excelUtils.setCell(x, 7, "Fail", path_TestData);
			}
		}
	}	

}