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
 * @since Aug 29, 2017 10:16:13 PM 
 */
public class EbayTest {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		int count = driver.findElements(By.xpath("//a")).size();
		System.out.println("totle link = " + count);
		WebElement footlink = driver.findElement(By.className("gf-lb"));
		int countfootlink = footlink.findElements(By.tagName("a")).size();
		String afterclick = null;
		String beforeclick = null;
		System.out.println("count of footlink :" + countfootlink);
		for (int i = 0 ; i < countfootlink; i++){
			System.out.println(footlink.findElements(By.tagName("a")).get(i).getText());
			if(footlink.findElements(By.tagName("a")).get(i).getText().contains("About eBay")){
				beforeclick = driver.getTitle();
				footlink.findElements(By.tagName("a")).get(i).click();
				afterclick = driver.getTitle();
				break;
			}
			
		}
		System.out.println("afterclick = " + afterclick);
		System.out.println("beforeclick = " + beforeclick);
		if (beforeclick != afterclick){
			
			if(driver.getPageSource().contains("Featured Stories")){
				System.out.println("PASS");
				System.out.println("afterclick = " + afterclick);
				System.out.println("beforeclick = " + beforeclick);
			}
			else{
				System.out.println("FAIL1");
			}
			
		}
		else{
			System.out.println("FAIL2");
		
		driver.close();
	}

}
}
