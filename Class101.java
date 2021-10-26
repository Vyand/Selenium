package Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Class101 {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		        //driver.get("https://www.betway.com");
		
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
								
				//Open web browser
				driver.navigate().to("https://amazon.in");
				//Maximize the web page
				driver.manage().window().maximize();
				//Get title name
				String title = driver.getTitle();
				
				//Compare title name and ignore cases
				if(title.equalsIgnoreCase("amizon.in"))
				{
					System.out.println("Title matches");
				}
				else
					System.out.println(title);
				
				//Locate a web element
				String tag_name ="";
				tag_name = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3)")).getText();
				System.out.println(tag_name);
				
				//Select navigation link
				WebElement bestSeller = driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(3"));
				Actions action = new Actions(driver);
				action.moveToElement(bestSeller).perform();
				Thread.sleep(2000);
				
				
				//Select text box search 
				WebElement myElement = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
				//type the text you wish to search
				myElement.sendKeys("AmazonBasics Extended Gaming Mouse Pad,Black"); 
				//pause the script to observe automation in action
				Thread.sleep(2000);
				//Click search button
				driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
				Thread.sleep(2000);
		
		
	}
}
