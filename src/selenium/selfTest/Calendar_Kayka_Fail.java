/**
 * 
 */
package selenium.selfTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Aug 31, 2017 1:10:46 AM 
 */
public class Calendar_Kayka_Fail{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kayak.com/");
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/section/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div/div[1]")).click();
		List<WebElement> daylist = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		System.out.println(count);
		for (int i = 0 ; i < count ; i++){
			String test = driver.findElements(By.className("day")).get(i).getText();
			//System.out.println(test);
			if(test.equalsIgnoreCase("20")){
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
