/**
 * 
 */
package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Sep 21, 2017 8:57:09 PM 
 */
public class TestBase {
	public WebDriver driver;
	@Test
	public void Login() throws IOException  
	{
		
		String filepath = "C:\\Users\\HAOSHU\\workspace\\selenium\\src\\datadriven\\datadriven.properties";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filepath);
		prop.load(fis);
		if(prop.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		if(prop.getProperty("browser").equals("firfox")){
			System.setProperty("webdriver.gecko.driver","D://selenium/geckodriver/geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(prop.getProperty("username")+Keys.ENTER);
		driver.close();
		System.out.println("URL:" + prop.getProperty("url") + "browser:" + prop.getProperty("browser"));
		System.out.println("TestNG finished");
		
		
	}
	@Test
	public void something()
	{
		System.out.println("test1");
	}
	@Test
	public void something2()
	{
		System.out.println("test2");
	}
	
}
