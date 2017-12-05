/**
 * 
 */
package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Jun 30, 2017 2:50:03 AM 
 */
public class Handling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//a[contains(@href,'support')]")).click();;
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator <String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
	}

}
