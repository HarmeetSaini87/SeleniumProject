package BillcallLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args)throws InterruptedException {
		
	// To short the Path for Drivers
			String projectpath= System.getProperty("user.dir");
			//System.out.println("projectpath : " +projectpath);
			 
		     //System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\GeckoDriver\\geckodriver.exe");
		     
			 System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver\\chromedriver.exe");
			 
			 //System.setProperty("webdriver.ie.driver", projectpath+"\\Drivers\\IEdriver\\IEDriverServer.exe");
			 //WebDriver driver = new FirefoxDriver();
			 WebDriver driver = new ChromeDriver();
			
			 //WebDriver driver = new InternetExplorerDriver();
			 //
			 
			 // Go to URL 
			 
			 driver.get("http://brmqa44.billcall.net/");
			 
			 // Enter User name 
			 WebElement Username  = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			 Username.sendKeys("harmeet");
			 
			 //Enter Password
			 
			 WebElement Password  = driver.findElement(By.xpath("//input[@id='txtPassword']"));
			 Password.sendKeys("billcall.123");
			 
			 //Click on Submit Button
			 WebElement Submit  = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
			 Submit.click();
			 
			 
			 //Wait for 3 seconds
			 Thread.sleep(3000);
			 
			 //Close  Browser
			 driver.close();
			 
			 System.out.println("Test Completed successfully");
			 
		}


}
