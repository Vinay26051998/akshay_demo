package genericUtilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtility {
	WebDriver driver;
	JavascriptExecutor js;
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
		js = (JavascriptExecutor)driver;
	}
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	/**
	 * This method is used to click on the element by using JavascriptExecutor
	 * 
	 */
	public void clickingonElement(WebElement element) {
		js.executeScript("arguments[0].click();",element);
	}
	/**
	 * this method it is used to enter or send the data by using javascriptExecutor
	 * @param element
	 * @param data
	 */
	public void enteringDataIntoElement(WebElement element,String data) {
		js.executeScript("arguments[0].value='"+data+"'",element);

	}
	/**
	 * this method it is used to give the explicitly wait to the script
	 * @param time
	 * @return
	 */
	public WebDriverWait explicitWaitReference(int time) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(time));
		return wait;

	}
	/**
	 * this method return the actions class reference
	 * @return
	 */
	public Actions actionsReference() {
		Actions action=new Actions(driver);
		return action;
	}
	public void handlingDrop(WebElement element,String value) {
		Select select=new Select(element);
		try {
			select.selectByVisibleText(value);
		}catch(Exception e1) {
			try {
				select.selectByValue(value);
			}
		
		catch(Exception e) {
			int val=Integer.parseInt(value);
		
			select.selectByIndex(val);
		}
			}


	}
	/**
	 * This method it is used to perform scrllBy action
	 * @param x
	 * @param y
	 */
	public void scrollByAction(int x,int y) {
		js.executeScript("window.scrollBy("+x+","+y+")");

	}
	/**
	 *This method is used to scroll to the element to increase the element visibility 
	 * if the status is true the window will scroll until the element reaches to the top
	 *  if the status is false the window will scroll until the element reaches to the bottom
	 *  @param element
	 *  @param status
	 */
	public void scrollIntoviewAction(WebElement element,Boolean status) {
		js.executeScript("argument[0].scrollIntoView("+status+")",element);
	}
	
	public void switchingToFrame(int index) {
		driver.switchTo().frame(index);
	}
	/**
	 * this method is used to switch the 
	 * @param name
	 */
	public void switchingToFrame(String name) {
		driver.switchTo().frame(name);
	}
	/**
	 * This method is used to switch the driver control from window to frame
	 * @param element
	 */
	public void switchingToFrame(WebElement element) {
		driver.switchTo().frame(element);
}
/**
 * This method is used to switch the driver control from frame to window
 */
	public void switchingBackToMainWindow() {
		driver.switchTo().defaultContent();
	}
	/**
	 * This method is used to switching to alert pop-up by using this method we can use methods
	 * @return
	 */
	public Alert returnAlertReference() {
		return driver.switchTo().alert();
	}

	/**
	 * This method is used to Switch to any child Window
	 * @param allwindowID
	 * @param parentID
	 * @param expectedtitle
	 */
	public void switchingToTheChilWindow(Set<String> allwindowID,String parentID,String expectedtitle) {
		allwindowID.remove(parentID);
		for (String ID:allwindowID) {
			driver.switchTo().window(ID);
			if (expectedtitle.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}
	}

	/**
	 * THis method is used to Switch the window control to Parent Window
	 * @param ParentID
	 */
	public void switchingBackToMainWindow(String ParentID) {
		driver.switchTo().window(ParentID);
	}
	}


//old approach

//public void clickingonElement(WebElement element,WebElement element) {
//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].click();",element);
