package BillcallLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BillcallLoginFramework.Billcallloginfinal;

public class Billcallextentreports {
	 private static WebDriver driver = null;

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");
		
		 ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        // creates a toggle for the given test, adds all log events under it    
	        ExtentTest test1 = extent.createTest("BillcallLogin", "Test to validate billcalllogin");
	        
	        String projectpath= System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			test1.log(Status.INFO, "Starting Test Case");
			driver.get("http://brmqa44.billcall.net/");
			test1.pass("Navigated to billcall ");
			
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("harmeet");
			
			test1.pass("Enter txt in Username");
			
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("billcall.123");
			
			test1.pass("Enter txt in password");
			
			driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
			
			test1.pass("Pressed Submit Button");
	        
			 driver.close();
			 
			 test1.pass("Close Browser");
			 
			 test1.info("Test completed");
			 
			 extent.flush();
			 
	}

}
