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
 * @since Jun 25, 2017 12:23:58 AM 
 */
public class DropDowns {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","D://selenium/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://book.spicejet.com/Search.aspx");
		//Select s = new Select(driver.findElement(By.id("package-advanced-preferred-class")));
		//s.selectByValue("f");
		//s.selectByIndex(2);
		//s.selectByVisibleText("Business");
		//driver.findElement(By.xpath("//input[@class='select_CTXT']")).click();;
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).click();;
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("//a[@value='IXC']")).click();
		
	}

}
 