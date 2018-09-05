import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

 public static void main(String[] args) throws InterruptedException {
	String projectpath= System.getProperty("user.dir");
	//System.out.println("projectpath : " +projectpath);
	 
     //System.setProperty("webdriver.gecko.driver", projectpath+"\\Drivers\\GeckoDriver\\geckodriver.exe");
     
	 System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver\\chromedriver.exe");
	 
	 //System.setProperty("webdriver.ie.driver", projectpath+"\\Drivers\\IEdriver\\IEDriverServer.exe");
	 //WebDriver driver = new FirefoxDriver();
	 WebDriver driver = new ChromeDriver();
	
	 //WebDriver driver = new InternetExplorerDriver();
	 
	 driver.get("http://brmqa44.billcall.net/");
	 
	 WebElement Username  = driver.findElement(By.xpath("//input[@id='txtUsername']"));
	 Username.sendKeys("harmeet");
	 
	 WebElement Password  = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	 Password.sendKeys("billcall.123");
	 
	 //WebElement Submit  = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
	 //Submit.
	 
	 
	 
	 Thread.sleep(3000);
	 
	 driver.close();
	 
}
	}

