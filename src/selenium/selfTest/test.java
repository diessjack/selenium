/**
 * 
 */
package selenium.selfTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Oct 30, 2017 9:58:55 PM 
 */
public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		boolean test = driver.findElement(By.xpath("//div[@class='hl-cat-nav']")).isDisplayed();
		if (test == true){
			System.out.print("pass");
		}
		driver.close();
	}
}
