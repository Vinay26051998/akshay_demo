package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.google.j2objc.annotations.Property;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Login_01_Test extends BaseClass {
	@Test
	public void Login_to_application_with_valid_credentials() throws InterruptedException {
		loginpage.getLoginLink().click();
		logger.log(Status.INFO,"User click on login link");
		Thread.sleep(2000);
		loginpage.getEmailTF().sendKeys("akshay@gmail.com");
		logger.log(Status.INFO,"User Entered Email address");
		loginpage.getPasswordTF().sendKeys("1234");
		logger.log(Status.INFO,"User Entered password");
		loginpage.getLoginButton().click();
		
	}
	

}
