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
 * @since Sep 3, 2017 5:30:57 AM 
 */
public class getTvShowDownLoad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.kmeiju.net/archives/28.html");
		//driver.findElements(By.xpath("html/body/div[3]/div[2]/div/div[3]/div[2]/table[1]/tbody/tr[2]/td[1]/a"))
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for (int i = 0; i < list.size(); i++) {
			 if (list.get(i).getText().contains("ÖÐÓ¢×ÖÄ».mp4")){
				 System.out.println(list.get(i).getAttribute("href")+ "  ");
			 }
		}
		//String y = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[3]/div[2]/table[1]/tbody/tr[2]/td[1]/a")).getAttribute("href");
		//System.out.println(y);

	}

}
