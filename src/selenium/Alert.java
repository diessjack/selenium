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
 * @since Jun 25, 2017 2:51:14 AM 
 */
public class Alert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D://selenium/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.javascripter.net/faq/alert.htm");
		driver.findElement(By.xpath("//input[@value='Try it now']")).click();
		System.out.println(driver.switchTo().alert().getText());
		String CT = driver.switchTo().alert().getText();
		if (CT.contains("Hello")){
		driver.switchTo().alert().dismiss();;
		//driver.switchTo().alert().accept();
		}

	}

}
