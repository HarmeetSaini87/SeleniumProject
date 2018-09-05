package BillcallLogin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BillcallLoginFramework.Billcallloginfinal;
import Config.Properitiesfile;

public class BillcallLoginTestNGTest {

	static WebDriver driver =null;
	public static String browsername = null;


	@BeforeTest
	public void logintest(){
		String projectpath= System.getProperty("user.dir");
		Properitiesfile.getproperties();

		if(browsername.equalsIgnoreCase("chrome")){

			System.setProperty("webdriver.chrome.driver",projectpath+"\\Drivers\\chromedriver\\chromedriver.exe");

			driver = new ChromeDriver();

		}
		else if (browsername.equalsIgnoreCase("firefox")){

			System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\GeckoDriver\\geckodriver.exe");

			driver = new ChromeDriver();

		}

		
		//System.out.println("projectpath : " +projectpath);

		//System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\GeckoDriver\\geckodriver.exe");

		//System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver\\chromedriver.exe");

		//System.setProperty("webdriver.ie.driver", projectpath+"\\Drivers\\IEdriver\\IEDriverServer.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver = new ChromeDriver();
	}
	@Test
	public void Billcalllogin() {




		driver.get("http://brmqa44.billcall.net/");


		Billcallloginfinal.Username(driver).sendKeys("harmeet");


		//Enter Password


		Billcallloginfinal.Password(driver).sendKeys("billcall.123");

		//Click on Submit Button


		Billcallloginfinal.Submit(driver).click();

		//Wait for 3 seconds
		// Thread.sleep(3000);

	}	 
	@AfterTest
	public void closetest(){
		//Close  Browser
		driver.close();

		System.out.println("Test Completed successfully");

	}


}
