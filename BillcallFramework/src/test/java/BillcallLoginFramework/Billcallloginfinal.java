package BillcallLoginFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Billcallloginfinal {

	private static WebElement element = null;

		
		public static WebElement Username (WebDriver driver)  {
		
			element  = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			return element;
	}
		
		public static WebElement Password (WebDriver driver)  {
			
			element  = driver.findElement(By.xpath("//input[@id='txtPassword']"));
			return element;
			
	}
		
         public static WebElement Submit (WebDriver driver)  {
			
			element  = driver.findElement(By.xpath("//input[@id='btnSubmit']"));
			return element;

}
         
}