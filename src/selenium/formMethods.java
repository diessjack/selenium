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
 * @since Jun 27, 2017 11:10:57 PM 
 */
public class formMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D://selenium/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		//System.out.println(driver.findElement(By.xpath("//input[@id='hp-widget__return']")).isDisplayed());;
		driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
	}

}
