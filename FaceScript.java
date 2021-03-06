package Selenium;
import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;



public class FaceScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lunge\\Downloads\\New folder\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications"); //to disable allow notification pop-up
		WebDriver driver = new ChromeDriver(opt);
		
		 driver.manage().window().maximize(); //Maximize web browser
		 
		 
		 	SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");  //date format
			Date curDate = new Date();
			String strDate = sdf.format(curDate); //current date
			String fileName = "ScreenShot_" + strDate; // file name name + timestamp
			File newFile = new File(fileName);
        
        //try catch block to handle exception
        try {
        	
            driver.get("https://www.facebook.com"); //Navigate to url
            Thread.sleep(5000);
            
            File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //take screenshot of Home page
            FileHandler.copy(screenshot1, new File("/Users/Lunge/Downloads/" + fileName + ".jpeg"));
            FileUtils.copyFile(screenshot1, new File("/Users/Lunge/Downloads/"+newFile+"1.jpeg")); // Copy the file to a location and use 
            
            
            driver.findElement(By.id("email")).sendKeys("0749903447");
            driver.findElement(By.id("pass")).sendKeys("Groupjksdjkdjkdskjsdjksdkdsjkdsjkdjkdsjkds",Keys.ENTER); //Login using wrong Password
            Thread.sleep(10000);
            
            File screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //take screenshot of Login Error
            FileHandler.copy(screenshot2, new File("/Users/Lunge/Downloads/" + fileName + ".jpeg"));
            FileUtils.copyFile(screenshot2, new File("/Users/Lunge/Downloads/"+newFile+"2.jpeg")); // Copy the file to a location and use 
           
           driver.findElement(By.id("pass")).sendKeys("Group3",Keys.ENTER); // Correct Password
           Thread.sleep(10000);
           
           File screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //take screenshot of Dashboard page
           FileHandler.copy(screenshot3, new File("/Users/Lunge/Downloads/" + fileName + ".jpeg"));
           FileUtils.copyFile(screenshot3, new File("/Users/Lunge/Downloads/"+newFile+"3.jpeg")); //Copy the file to a location and use 
           
           
           WebElement element = driver.findElement(By.xpath("//*[@id=\"facebook\"]/body")).findElement(By.tagName("div"));
           String text = element.getAttribute("id"); // to get Facebook session ID
           
           
           
           driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")).click();     
           Thread.sleep(10000); // click home icon to load news feed

           File screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //take screenshot of Dashboard page
           FileHandler.copy(screenshot4, new File("/Users/Lunge/Downloads/" + fileName + ".jpeg"));
           FileUtils.copyFile(screenshot4, new File("/Users/Lunge/Downloads/"+newFile+"4.jpeg")); //Copy the file to a location and use 
                                         
           driver.findElement(By.xpath("//*[@id=\""+ text +"\"]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div")).click();
           Thread.sleep(10000); // click status Text box
           File screenshot5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //take screenshot
           FileHandler.copy(screenshot5, new File("/Users/Lunge/Downloads/" + fileName + ".jpeg"));
           FileUtils.copyFile(screenshot5, new File("/Users/Lunge/Downloads/"+newFile+"5.jpeg")); //Copy the file to a location and use 
           
           driver.findElement(By.xpath("//*[@id=\""+text+"\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]"
           		+ "/div[1]/div/div/div/div/div/div/div[2]/div/div/div/div")).sendKeys("Dont Stop until you find a way ",Keys.ENTER);
           Thread.sleep(10000);    // Write your status 
           File screenshot6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //take screenshot of Dashboard page
           FileHandler.copy(screenshot6, new File("/Users/Lunge/Downloads/" + fileName + ".jpeg"));
           FileUtils.copyFile(screenshot6, new File("/Users/Lunge/Downloads/"+newFile+"6.jpeg")); //Copy the file to a location and use 
           
           
           driver.findElement(By.xpath("//*[@id=\""+text+"\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div/span/img")).click();
           Thread.sleep(10000); // Select status Background
          
       
           driver.findElement(By.xpath("//*[@id=\""+text+"\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div[4]/div/div")).click();
           Thread.sleep(10000); // Choose status Background
           File screenshot7 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //take screenshot of Dashboard page
           FileHandler.copy(screenshot7, new File("/Users/Lunge/Downloads/" + fileName + ".jpeg"));
           FileUtils.copyFile(screenshot7, new File("/Users/Lunge/Downloads/"+newFile+"7.jpeg")); //Copy the file to a location and use
           
           
           driver.findElement(By.xpath("//*[@id=\""+text+"\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div/div[3]/div/div/div/span/div/div/div[1]/div/div/div/i")).click();
           Thread.sleep(10000); // select to add emoji
           File screenshot8 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //take screenshot of Dashboard page
           FileHandler.copy(screenshot8, new File("/Users/Lunge/Downloads/" + fileName + ".jpeg"));
           FileUtils.copyFile(screenshot8, new File("/Users/Lunge/Downloads/"+newFile+"8.jpeg")); //Copy the file to a location and use

           driver.findElement(By.xpath("//*[@id=\""+text+"\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div/div/div/div/div[2]/div/div[1]/span[8]/div/img")).click();  
           Thread.sleep(10000); // Choose emoji
     
           driver.findElement(By.xpath("//*[@id=\""+text+"\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div/div/div/div/div[2]/div/div[11]/span[1]/div/img")).click();
           Thread.sleep(10000); // Choose emoji
     
           
           driver.findElement(By.xpath("//*[@id=\""+text+"\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div/div/div/div/div[2]/div/div[4]/span[2]/div/img")).click();
           Thread.sleep(10000); // Choose emoji

           driver.findElement(By.xpath("//*[@id=\""+text+"\"]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div")).click();
           Thread.sleep(10000); // upload status
           File screenshot9 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //take screenshot of Dashboard page
           FileHandler.copy(screenshot9, new File("/Users/Lunge/Downloads/" + fileName + ".jpeg"));
           FileUtils.copyFile(screenshot9, new File("/Users/Lunge/Downloads/"+newFile+"9.jpeg")); //Copy the file to a location and use


           //Path to Search box and search name
           driver.findElement(By.xpath("//*[@id=\""+ text +"\"]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("McNificent DatGuy BabyFace",Keys.ENTER);
           Thread.sleep(10000);
           
//           Other way to locate search box
//           driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/label/input")).sendKeys("McNificent  \"Babyface\" DatGuy",Keys.ENTER);
//           Thread.sleep(5000);
           
          //Take the screenshot
           File screenshot10 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // Take Screenshot of search data
           FileHandler.copy(screenshot10, new File("/Users/Lunge/Downloads/" + fileName + ".jpeg"));
           FileUtils.copyFile(screenshot10, new File("C:\\Users\\Lunge\\Downloads\\"+newFile+"10.png"));
            
//            
            
    		System.out.println("**Report***");
            System.out.println("* Description               Status*");
            System.out.println("* --------------------------------*");
            System.out.println("* Open Url                   Pass *");
            System.out.println("* Screenshot 1               Pass *");
            System.out.println("* login wrong password       Pass *");
            System.out.println("* Screenshot 2               Pass *");
            System.out.println("* login Correct password     Pass *");
            System.out.println("* Screenshot 3               Pass *");
            System.out.println("* Open News feed             Pass *");
            System.out.println("* Screenshot 4               Pass *");
            System.out.println("* Create post                Pass *");
            System.out.println("* Screenshot 5               Pass *");
            System.out.println("* write post                 Pass *");
            System.out.println("* Screenshot 6               Pass *");
            System.out.println("* select Background          Pass *");
            System.out.println("* Screenshot 7               Pass *");
            System.out.println("* select emoji               Pass *");
            System.out.println("* Screenshot 8               Pass *");
            System.out.println("* update status              Pass *");
            System.out.println("* Screenshot 9               Pass *");
            System.out.println("* Search Name                Pass *");
            System.out.println("* Screenshot 10              Pass *");          
            System.out.println("*****");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        driver.close(); //closing the webdriver
	}

}