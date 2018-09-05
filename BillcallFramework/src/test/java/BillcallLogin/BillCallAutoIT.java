package BillcallLogin;



import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;





public class BillCallAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {

		sheetupload();
	}

	public static void sheetupload() throws InterruptedException, IOException{

		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://brmqa44.billcall.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("harmeet");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("billcall.123");
		driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();

		Actions actions = new Actions(driver); 
		WebElement menuHoverLink = driver.findElement(By.linkText("Routing"));
		actions.moveToElement(menuHoverLink).perform();
		driver.findElement(By.cssSelector("a[href='/Fusion/Lst_MarginProfile.aspx']")).click(); 
		
		

		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@title='New']")).click();// get the current window handle
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		
        Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='drpServiceType']")));  
        dropDown.selectByIndex(2);
        
		driver.findElement(By.xpath("//input[@id='txtProfileName']")).sendKeys("AutoITTest1");
		driver.findElement(By.xpath("//input[@id='rblMarginType_1']")).click();
		driver.findElement(By.xpath("//input[@id='rblAction_1']")).click();
		Select dropDown1 = new Select(driver.findElement(By.xpath("//select[@id='drpDefaultMarginRule']")));
		 dropDown1.selectByIndex(2);
		 /*driver.findElement(By.xpath("//input[@id='fileToUpload']")).sendKeys("F:/DataBackUP/D_Drive/Selenium Neon/eclipse/Projects/BillcallFramework/Excel/ImportMarginRuleForSMS.xlsx");
		 driver.findElement(By.xpath("//input[@id='imbSave']")).click();
		 try {
		        WebDriverWait wait = new WebDriverWait(driver, 2);
		        wait.until(ExpectedConditions.alertIsPresent());
		        Alert alert = driver.switchTo().alert();
		        alert.accept();
		    } catch (Exception e) {
		        //exception handling
		    }
		 driver.close();
		 driver.switchTo().window(parentHandle);
		 
		 
		 
		 /*Alert alert = driver.switchTo().alert();
		 String alertMessage= driver.switchTo().alert().getText();
		 alert.accept();	*/
		 
		driver.findElement(By.xpath("//input[@id='fileToUpload']")).click();
		Runtime.getRuntime().exec("F:/DataBackUP/D_Drive/Selenium Neon/eclipse/Projects/BillcallFramework/FileuploadScript.exe");
	
		

			 
		} 

	}


