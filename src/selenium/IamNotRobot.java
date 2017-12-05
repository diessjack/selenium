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
 * @since Sep 1, 2017 6:10:16 AM 
 */
public class IamNotRobot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		//driver.switchTo().frame(driver.findElement(By.className("g-recaptcha")));
		//driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
		int num = helper(driver,By.xpath("html/body/div[2]/div[3]/div[1]/div/div/span/div[5]") );
		System.out.print(num);

	}
	public static int helper(WebDriver driver, By by){
		int count = driver.findElements(By.tagName("iframe")).size();
		//System.out.println(count);
		int i;
		for (i = 0; i < count ; i++){
			driver.switchTo().frame(i);
			int x = driver.findElements(By.tagName("iframe ")).size();	
			if(x > 0){
				//driver.findElement(by).click();
				break;
			}
			else{
				System.out.println("Continue loop");
			}
			//System.out.print(x);
		}
		driver.switchTo().defaultContent();
		return i;
		
		//driver.switchTo().frame(arg0);
		
	}

}
