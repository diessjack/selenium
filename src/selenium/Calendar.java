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
 * @since Aug 31, 2017 1:10:46 AM 
 */
public class Calendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.cssSelector("#travel_date")).click();
		List<WebElement> daylist = driver.findElements(By.className("day"));
		driver.findElement(By.xpath("html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).click();;
		int countmonth = driver.findElements(By.className("month")).size();
		int countday = driver.findElements(By.className("day")).size();
		String Selected;
		String ClassName ;
		System.out.println(countmonth);
		helper(countmonth, driver, "month", "Dec");
		helper(countday, driver, "day", "20");
		System.out.println("Selected");
		driver.close();

	}
	private static int helper(int count,WebDriver driver, String Classname, String Selected ){
		for (int i = 0 ; i < count ; i++){
			String test = driver.findElements(By.className(Classname)).get(i).getText();
			//System.out.println(test);
			if(test.equalsIgnoreCase(Selected)){
				driver.findElements(By.className(Classname)).get(i).click();
				break;
			}
		}
		System.out.println("PASS");
		return 0;
	}
	

}
