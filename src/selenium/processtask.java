/**
 * 
 */
package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Sep 10, 2017 2:37:55 PM 
 */
public class processtask {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		///DesiredCapabilities cap=DesiredCapabilities.chrome();
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		//WebDriver driver = new ChromeDriver(cap);
		//driver.get("https://www.google.com");
		//Set<org.openqa.selenium.Cookie> abc = driver.manage().getCookies();
		//System.out.println(abc.size());
		//driver.manage().deleteAllCookies();
		//Set<org.openqa.selenium.Cookie> abce = driver.manage().getCookies();
		//System.out.println(abce.size());
		//WindowsUtils.killPID("36836");
		//WindowsUtils.killByName("Calculator.exe");
		System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		for(int i = 0 ; i < 2 ; i++){
		FileUtils.copyFile(scrFile, new File("D:\\newScreenShot"+ i +".png"));
		}
	}

}
