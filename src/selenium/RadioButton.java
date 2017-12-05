/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Jun 25, 2017 1:43:48 AM 
 */
public class RadioButton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D://selenium/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Water']")).click();
		//driver.findElement(By.xpath("//input[@name='group1']")).click();
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		//driver.findElements(By.xpath("//input[@name='group1']")).get(1).click();;
		for (int i = 0; i < count; i++){
			//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			String CT = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println(CT);
			if (CT.equals("Cheese")){
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				System.out.println("Good to Go");
			}
		}
	}

}
