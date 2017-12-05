/**
 * 
 */
package datadriven;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author HAOSHU FENG
 * @version 1.0
 * @since Sep 17, 2017 7:05:00 PM 
 */
public class Annotaitons {
	@BeforeMethod
	public void userid(){
		System.out.println("Userid and password");
	}
	@Test(dataProvider = "getData")
	public void Userid(String username, String password,
						String id){
		System.out.println("testID:" + id);
		System.out.println("userId: " + username);
		System.out.println("Password: " + password);
		
	}
	@AfterSuite
	public void OpeningBrowser(){
		System.out.println("Test finish");
	}
	@BeforeSuite
	public void password(){
		System.out.println("Test Begin");
	}
	@DataProvider
	public Object[][]getData(){
		//int i;
		//int j;
		Object[][] data = new Object[3][3];
		data[0][0] = "adminuser 1";
		data[0][1] = "adminpassword 1";
		data[0][2] = "1";
		
		data[1][0] = "adminuser 2";
		data[1][1] = "adminpassword 2";
		data[1][2] = "2";
		
		data[2][0] = "adminuser 3";
		data[2][1] = "adminpassword 3";
		data[2][2] = "3";
		return data;
		
	}
}
