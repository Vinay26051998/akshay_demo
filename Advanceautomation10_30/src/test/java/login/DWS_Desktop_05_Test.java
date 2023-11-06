package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)

public class DWS_Desktop_05_Test extends BaseClass {
	
	@Test
	public void Add_two_product_to_compare_and_check() {
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
		List<WebElement> remove = driver.findElements(By.xpath("//input[@value='Remove']"));
		if (remove.size()==2) {
			System.out.println("The products in the compare ");
		}
	}


}
