/**
 * 
 */
package Parallel;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Sep 13, 2017 7:03:58 PM 
 */
public class CloudTest {
	 @Test
	public   void   SaucelabTest() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability("version", "5");
		dc.setCapability("platform", "XP");
		WebDriver driver = new RemoteWebDriver(
				new URL("hettp://diessjack:338256eb-f355-4d04-9012-d57680e184d1@ondemand.saucelabs.com:80/wd/hub"),dc);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
