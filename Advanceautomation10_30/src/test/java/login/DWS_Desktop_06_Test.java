package login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
import genericUtilities.WebDriverUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Desktop_06_Test extends BaseClass {
	@Test
	public void Add_product_to_compare_and_remove_them() {
		WebElement computers = computerspage.getComputerslink();
		Actions action = webDriverUtility.actionsReference();
		action.moveToElement(computers).perform();
		computerspage.getDesktoplink().click();
		logger.log(Status.INFO, "User Navigate to the desktop module");
		computerspage.getProduct1().click();
		computerspage.getComparebutton().click();
		logger.log(Status.INFO, "User added product to compare list");
		driver.navigate().back();
		driver.navigate().back();
		computerspage.getProduct2().click();
		computerspage.getComparebutton().click();
		logger.log(Status.INFO, "User added product to compare list");
		computerspage.getRemovebutton().click();
		logger.log(Status.INFO, "User Removed product from the compare list");
		computerspage.getRemovebutton().click();
		logger.log(Status.INFO, "User Removed product from the compare list");
	}

}
