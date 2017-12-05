/**
 * 
 */
package selenium.selfTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Sep 1, 2017 2:56:25 AM 
 */
public class MovieSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dnvod.tv/Movie/List.aspx?isn=4&cid=0%2c1%2c3&region=&year=&star=&tags=&dir=&isfree=-1");
		WebElement title = driver.findElement(By.className("cp_a"));
		int countnum = title.findElements(By.tagName("a")).size();
		System.out.println(countnum);
		for (int i = 0; i < countnum; i++){
			String count = title.findElements(By.tagName("a")).get(i).getText();
			System.out.println(count);
			break;
		}
		driver.close();
	}

}
