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
 * @since Jun 23, 2017 1:01:07 AM 
 */
public class Locator1 {
	public static void main(String[] sargs){
		
		System.setProperty("webdriver.gecko.driver","D://selenium/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.name("email")).sendKeys("diessjack@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("testtest"); 
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.id("loginbutton")).click();
		//driver.get("http://google.com");
		//driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[3]/center/input[1]")).click();
		
	}

}
