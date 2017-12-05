/**
 * 
 */
package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Sep 17, 2017 8:12:01 PM 
 */
public class DependenyAnnotion {
	@Test
	public void openingBrowser()  {
		System.out.println("open");
		
	}
	@Test(dependsOnMethods={"openingBrowser"},alwaysRun = true)
	public void check(){
		System.out.println("dependsOnMethods check");
	}
	
	@AfterSuite
	public void timerelated() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("wait 5s"); 
		
	}
	@BeforeSuite
	public void beforesuite(){
		System.out.println("BeforeTestSuite");
	}
	@Test(enabled=true)
	public void payment(){
		System.out.println("pay");
	}

}
