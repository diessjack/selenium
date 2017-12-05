/**
 * 
 */
package PackTwo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Sep 17, 2017 7:05:00 PM 
 */
public class Annotaitons {
	@BeforeMethod
	public void userid(){
		System.out.println("Userid ");
	}
	@Test(groups={"priority1"})
	public void test(){
		System.out.println("priority1");
	}
	@AfterSuite
	public void OpeningBrowser(){
		System.out.println("aftersuite");
	}
	@BeforeSuite
	public void password(){
		System.out.println("beforetest");
	}
}
