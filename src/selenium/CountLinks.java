/**
 * 
 */
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Jul 2, 2017 1:31:15 AM 
 */
public class CountLinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		//Count the Link in the Entire page.
		int a = driver.findElements(By.xpath("//a")).size();
		System.out.println("Totle link number: " + a );
		//Count of link in Some Section
		WebElement footLink = driver.findElement(By.xpath("//div[@id='navFooter']"));
		int b = footLink.findElements(By.tagName("a")).size();
		System.out.println("Footbar Link count: " + b);
		WebElement sellAtAmazon = driver.findElement(By.xpath("//td[3]"));
		String Beforclicking = null;
		String Afterclicking = null;
		int c = sellAtAmazon.findElements(By.tagName("a")).size();
		System.out.println("Make Money with us section's links count: " + c);
		for (int i = 0; i < c; i++){
			System.out.println(sellAtAmazon.findElements(By.tagName("a")).get(i).getText());
			if(sellAtAmazon.findElements(By.tagName("a")).get(i).getText().contains("Become an Affiliate"))
			{
				Beforclicking = driver.getTitle();
				System.out.println("Beforclicking:" + Beforclicking);
				sellAtAmazon.findElements(By.tagName("a")).get(i).click();
				Afterclicking = driver.getTitle();
				System.out.println("Afterclicking :" + Afterclicking);
				break;
			}
		}
		if (Beforclicking != Afterclicking){
			boolean test = driver.findElement(By.className("ac-cms-padding-top-5")).isDisplayed();
			if (test == true ){
			System.out.println("PASS");
			
		}
		}
		else{
			System.out.println("FAIL");
		}
		driver.close();
		//sellAtAmazon.findElements(By.tagName("a")).get(c-1).click();
		//driver.close();
		

	}

}
