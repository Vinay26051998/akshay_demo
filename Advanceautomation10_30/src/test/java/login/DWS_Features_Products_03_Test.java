package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
import genericUtilities.WebDriverUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Features_Products_03_Test extends BaseClass {
	@Test
	public void Add_product_to_cart_and_check_in_cart() {
		
		welcomepage.getAddtocartbutton().click();
		logger.log(Status.INFO, "User able to add the product to cart");
		
		welcomepage.getShoppingcartlink().click();
		logger.log(Status.INFO, "User able to add the product to cart");
		if (welcomepage.getCheckoutbutton().isDisplayed()) {
			System.out.println("The Product is added to cart");
		}
	}
	

}
