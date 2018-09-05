package BillcallLoginFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillcallLoginPageObjects {
	
	WebDriver driver = null;
	
	By username = By.xpath("//input[@id='txtUsername']");
	By password = By.xpath("//input[@id='txtPassword']");
	By submitbutton = By.xpath("//input[@id='btnSubmit']");
	
	public BillcallLoginPageObjects(WebDriver driver){
		 this.driver = driver;
		
	}
	
	public void setTextInUsername(String text){
		
		driver.findElement(username).sendKeys(text);
		
	}
	

	public void setTextInPassword(String text){
		
		driver.findElement(password).sendKeys(text);
		
	}
	

	public void clicksubmitbutton(){
		
		driver.findElement(submitbutton).click();
		
	}
	
}


