package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//a[text()='Register']")
	private WebElement registerLink;

	@FindBy(xpath="//input[@type='radio'and @value='M']")
	private WebElement malebutton;

	@FindBy(id="FirstName")
	private WebElement FirstName;

	@FindBy(id="LastName")
	private WebElement LastName;

	@FindBy(id="Email")
	private WebElement emailTF;

	@FindBy(id="Password")
	private WebElement passwordTF;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpasswordTF;
	
	

	@FindBy(xpath="//input[@name='register-button']")
	private WebElement registerButton;

	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getEmailTF() {
		return emailTF;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public WebElement getMalebutton() {
		return malebutton;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getConfirmpasswordTF() {
		return confirmpasswordTF;
	}
	
}
