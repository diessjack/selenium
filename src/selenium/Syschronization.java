/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Jun 28, 2017 1:00:17 AM 
 */
public class Syschronization {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D://selenium/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@id='H-destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='H-fromDate']")).sendKeys(Keys.ENTER);
		WebDriverWait d = new WebDriverWait(driver,20);
		//d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'New-York-Hotels-Avalon-Hotel')]")));
		d.until(ExpectedConditions.titleContains("All"));
		driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-Avalon-Hotel')]")).click();;
	}

}
