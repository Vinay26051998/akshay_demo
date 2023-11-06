package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {
	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/jewelry']")
	private WebElement jewelrylink;
	
	@FindBy(xpath = "//a[contains(@href,'tricentis.com/jewelry?price=0-500')]")
	private WebElement filteroption;

	public WebElement getJewelrylink() {
		return jewelrylink;
	}

	public WebElement getFilteroption() {
		return filteroption;
	}
	
	@FindBy(xpath="//a[text()='Black & White Diamond Heart']")
	private WebElement jewelryitem;
	
	@FindBy(xpath = "//input[@value='Email a friend']")
	private WebElement emailafriend;
	
	@FindBy(id = "FriendEmail")
	private WebElement friendmail;
	
	@FindBy(id = "YourEmailAddress")
	private WebElement mymail;
	
	@FindBy(name = "send-email")
	private WebElement sendemailbutton;

	public WebElement getJewelryitem() {
		return jewelryitem;
	}

	public WebElement getEmailafriend() {
		return emailafriend;
	}

	public WebElement getFriendmail() {
		return friendmail;
	}

	public WebElement getMymail() {
		return mymail;
	}

	public WebElement getSendemailbutton() {
		return sendemailbutton;
	}
	

}
