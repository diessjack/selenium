/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Jun 29, 2017 11:34:43 PM 
 */
public class ActionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		//driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello").sendKeys(Keys.ENTER);
		a.moveToElement(move).contextClick().build().perform();
		WebElement go = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		a.moveToElement(go).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello").doubleClick().build().perform();;
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	}

}
