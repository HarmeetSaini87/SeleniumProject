package BillcallLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BillcallLoginDesiredCapabilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath= System.getProperty("user.dir");
		
		DesiredCapabilities caps =new DesiredCapabilities();
		
		
		System.setProperty("webdriver.ie.driver", projectpath+"\\Drivers\\IEdriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://brmqa44.billcall.net/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("harmeet");



		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("billcall.123");


		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();

		driver.close();
	}

}
