/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Jun 23, 2017 2:27:36 AM 
 */
public class customized {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("//input[@class='gsfi']")).sendKeys("test");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();;
		//driver.findElement(By.xpath("//div[@id='reg_form_box']")).sendKeys("abc");;
		
	}

}
