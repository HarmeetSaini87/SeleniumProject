package BillcallLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BillcallLoginFramework.BillcallLoginPageObjects;

public class BillCallloginPageTest1 {
	
	private static WebDriver driver = null;
			
	public static void main(String[] args) {
		billcalllogintest();
		
	}
	
	public static void billcalllogintest(){
		
		String projectpath= System.getProperty("user.dir");
		
		 System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 BillcallLoginPageObjects login= new BillcallLoginPageObjects(driver);
		// BillcallLoginPageObjects password= new BillcallLoginPageObjects(driver);//
		 
		 
		 driver.get("http://brmqa44.billcall.net");
		 
		 login.setTextInUsername("harmeet");
		 login.setTextInPassword("billcall.123");
		 
		 login.clicksubmitbutton();
		 
		 driver.close();
	}

}
