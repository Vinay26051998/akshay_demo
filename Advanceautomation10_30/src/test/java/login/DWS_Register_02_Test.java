package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)
public class DWS_Register_02_Test extends BaseClass {
	@Test
	public void Register_to_application_with_valid_credentials() {
		registerpage.getRegisterLink().click();
		logger.log(Status.INFO,"User click on register link");
		registerpage.getMalebutton().click();
		registerpage.getFirstName().sendKeys("akshay");
		logger.log(Status.INFO,"User send details to firstname");
		registerpage.getLastName().sendKeys("r s");
		logger.log(Status.INFO,"User send details to lastname");
		registerpage.getEmailTF().sendKeys("akshayrs08@gmail.com");
		logger.log(Status.INFO,"User Entered Email address");
		registerpage.getPasswordTF().sendKeys("12345");
		registerpage.getConfirmpasswordTF().sendKeys("12345");
		logger.log(Status.INFO,"User Entered password");
		registerpage.getRegisterButton().click();
		
	}
	

}
