package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import BillcallLogin.BillcallLoginTestNGTest;

public class Properitiesfile {

	static Properties prop = new Properties();
	static String projectpath =  System.getProperty("user.dir");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getproperties();
        setProperties();
        getproperties();
	}

	public static void getproperties(){

		try{


			InputStream input = new FileInputStream(projectpath+"\\src\\test\\java\\Config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			BillcallLoginTestNGTest.browsername= browser;

		}
		catch (Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void setProperties(){
		try {
               OutputStream output =  new FileOutputStream (projectpath+"\\src\\test\\java\\Config\\config.properties");
               prop.setProperty("browser", "chrome");
               prop.store(output, null);
		}
		catch (Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
