package BillcallLogin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BillcallLoginExtentReportwithTestNG {

	static WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	@BeforeSuite
	public void setup(){

		//Ctrl+shift+O to Remove all error related to libraries in one go 
		// start reporters
		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	
	public static void beforetest(){
		String projectpath= System.getProperty("user.dir");
		//System.out.println("projectpath : " +projectpath);
		 
	     //System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\GeckoDriver\\geckodriver.exe");
	     
		 System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver\\chromedriver.exe");
		 
		 //System.setProperty("webdriver.ie.driver", projectpath+"\\Drivers\\IEdriver\\IEDriverServer.exe");
		 //WebDriver driver = new FirefoxDriver();
		 driver = new ChromeDriver();
		
	}

	@Test
	public void test1() throws Exception{

		ExtentTest test = extent.createTest("BillcallLogin", "Test to validate billcalllogin");

		test.log(Status.INFO, "Starting Test Case");
		driver.get("http://brmqa44.billcall.net/");
		test.pass("Navigated to billcall ");
		
		

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("harmeet");
		
		test.pass("Enter txt in Username");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("billcall.123");
		
		test.pass("Enter txt in password");
		
		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
		
		test.pass("Pressed Submit Button");


	}
	
	@AfterTest
	 public void closetest(){
	 //Close  Browser
	 driver.close();

	 System.out.println("Test Completed successfully");
	 
}


	@AfterSuite
	public void teardown(){

		extent.flush();

	}

}
