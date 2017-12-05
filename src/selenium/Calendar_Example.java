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
 * @since Sep 1, 2017 4:54:27 AM 
 */
public class Calendar_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//April 23
		driver.findElementByXPath(".//*[@id='travel_date']").click();
		int countmonth = driver.findElements(By.className("month")).size();
		int countday = driver.findElements(By.className("day")).size();
		String Selected;
		String ClassName ;
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("Dec"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		helper(countday, driver, "day", "20");
		

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
