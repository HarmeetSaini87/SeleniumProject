package BillcallLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import BillcallLoginFramework.Billcallloginfinal;

public class BillcallLoginTest {
	
	private static WebDriver driver =null;

	public static void main(String[] args)throws InterruptedException {
		
	// To short the Path for Drivers
			String projectpath= System.getProperty("user.dir");
			//System.out.println("projectpath : " +projectpath);
			 
		     //System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\GeckoDriver\\geckodriver.exe");
		     
			 System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver\\chromedriver.exe");
			 
			 //System.setProperty("webdriver.ie.driver", projectpath+"\\Drivers\\IEdriver\\IEDriverServer.exe");
			 //WebDriver driver = new FirefoxDriver();
			 driver = new ChromeDriver();
			
			 //WebDriver driver = new InternetExplorerDriver();
			 //
			 
			 // Go to URL 
			 
			 driver.get("http://brmqa44.billcall.net/");
			 
	
			 Billcallloginfinal.Username(driver).sendKeys("harmeet");
			 
			 
			 //Enter Password
			 
			
			 Billcallloginfinal.Password(driver).sendKeys("billcall.123");
			 
			 //Click on Submit Button
		
			 
			 Billcallloginfinal.Submit(driver).click();
			 
			 //Wait for 3 seconds
			 Thread.sleep(3000);
			 
			 //Close  Browser
			 driver.close();
			 
			 System.out.println("Test Completed successfully");
			 
		}


}
