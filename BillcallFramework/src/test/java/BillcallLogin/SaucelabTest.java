package BillcallLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SaucelabTest {

	public static final String USERNAME = "harmeetsaini87";
	public static final String ACCESS_KEY = "f325a0d7-e508-4d3d-90f0-3512629ad1c0";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "latest");

		//WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		/**
		 * Goes to Sauce Lab's guinea-pig page and prints title
		 */

		driver.get("http://brmqa44.billcall.net/");
		System.out.println("title of page is: " + driver.getTitle());
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("harmeet");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("billcall.123");
		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();

		driver.quit();
		System.out.println("Test Completed");
	}
}


