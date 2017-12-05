/**
 * 
 */
package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 


/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Jun 22, 2017 11:32:08 PM 
 */
public class Browserinvocation {
	 public static void main(String[] args){
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","D://selenium/geckodriver/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		String e = driver.getCurrentUrl();
		System.out.println(e);
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getCurrentUrl());
		driver.close();
//		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
//		driver= new ChromeDriver();
//		
	}

}
