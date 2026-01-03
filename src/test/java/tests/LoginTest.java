package tests;

import org.testng.annotations.Test;

import Pages.LoginPage;
import base.Base;

public class LoginTest extends Base
{
	 @Test
	    public void logintest() {
	        // ✅ Use inherited driver from Base
	        LoginPage page = new LoginPage(driver);
	 page.enteruser("standard_user");
	 page.enterpass("secret_sauce");
	 page.clicklogin();
	 
	 
 }
}
