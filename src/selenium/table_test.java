/**
 * 
 */
package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Sep 10, 2017 1:31:34 PM 
 */
public class table_test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.kmeiju.net/archives/31.html");
		WebElement table = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[3]/div[2]/table[1]"));
		int count = table.findElements(By.tagName("tr")).size();
		int i = 0;
		List<WebElement> num = table.findElements(By.tagName("tr"));
		for (WebElement eachrow : num){
			List<WebElement> eachcoloumn = eachrow.findElements(By.tagName("td"));
			i++;
			System.out.println("number of coloumn in " + i + " are " + eachcoloumn.size());
			for(WebElement text : eachcoloumn){
				List<WebElement> list = text.findElements(By.tagName("a"));
				for (int j = 0; j < list.size(); j++) {
						 System.out.println(list.get(j).getAttribute("href")+ "  ");
				}
			}
		}
		
		driver.close();
	}


}
