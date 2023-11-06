package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Books_04_Test extends BaseClass {
	@Test
	public void Add_a_book_to_the_cart() {
		bookspage.getBookslink().click();
		logger.log(Status.INFO, "User navigate to books link");
		bookspage.getAddtocartinbooks().click();
		logger.log(Status.INFO, "User Add book to cart successfully");
		bookspage.getShoppingcartlink().click();
		
		if (welcomepage.getCheckoutbutton().isDisplayed()) {
			System.out.println("The Book is added to the cart");
		}
	}

}
