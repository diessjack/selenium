/**
 * 
 */
package Parallel;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Sep 12, 2017 6:37:35 PM 
 */
public class test {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
				WebDriver driver;
				//System.setProperty("webdriver.gecko.driver","D://selenium/geckodriver/geckodriver.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				String node = "http://ondemand.saucelabs.com:80";
				//capabilities.setCapability(FirefoxDriver.BINARY,new File("C://Program Files (x86)/Mozilla Firefox/firefox.exe").getAbsolutePath());
				driver = new RemoteWebDriver(new URL(node), capabilities);
				
				
				driver.get("http://google.com");
				System.out.println(driver.getTitle());
//		WebDriver driver;
//		String BaseURL="http://www.google.com";
//	    String NodeURL="http://localhost:4444/wd/hub";
//	    System.setProperty("webdriver.chrome.driver","D://selenium/chromedriver_win32/chromedriver.exe");
//	    DesiredCapabilities capa =DesiredCapabilities.chrome();
//	    capa.setBrowserName("chrome");
//	    capa.setPlatform(Platform.ANY);
//	    driver=new RemoteWebDriver(new URL(NodeURL),capa);
//	    driver.get("http://google.com");
//		System.out.println(driver.getTitle());

	}

}
