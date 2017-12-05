/**
 * 
 */
package datadriven;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Sep 17, 2017 8:12:01 PM 
 */
public class DependenyAnnotion extends TestBase{
	@Test
	public void openingBrowser() throws IOException  {
		Login();
		System.out.println("open");
		
	}
	@Test(dependsOnMethods={"openingBrowser"},alwaysRun = true)
	public void check(){
		System.out.println("dependsOnMethods checked");
	}
	
//	@AfterSuite
//	public void timerelated() throws InterruptedException{
//		Thread.sleep(5000);
//		System.out.println("wait 5s"); 
//	}
	@BeforeSuite
	public void beforesuite(){
		System.out.println("BeforeTestSuite");
	}
	@Test(groups={"priority2"})
	public void payment(){
		System.out.println("priority test 2");
	}
	@Test 
	@Parameters({"adminUserid","password"})
	public void datatest(String UserID, String password){
		System.out.println("UserId:");
		System.out.println(UserID);
		System.out.println("Password:");
		System.out.println(password);
	}


}
