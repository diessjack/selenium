/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Jun 24, 2017 9:57:47 PM 
 */
public class Css {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","D://selenium/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("test123");
		driver.findElement(By.cssSelector("#password")).sendKeys("test");
		//driver.findElement(By.cssSelector(".input.r4.wide.mb16.mt8.password")).sendKeys("test");
		
		//driver.findElement(By.cssSelector("#Login")).click();
	}

}
