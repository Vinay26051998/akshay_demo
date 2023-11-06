package genericUtilities;
	
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v108.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.BooksPage;
import objectRepository.ComputersPage;
import objectRepository.JewelryPage;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;
import objectRepository.WelcomePage;

public class BaseClass implements IAutoConstants {

	public static WebDriver driver;
	public static TakeScreenShotUtility screenshot;
	public static WebDriverUtility webDriverUtility;
	public static ExtentTest logger;
	public static LoginPage loginpage;
	public static RegisterPage registerpage;
	public static WelcomePage welcomepage;
	public static BooksPage bookspage;
	public static ComputersPage computerspage;
	public static JewelryPage jewelrypage;
	
	public static PropertyUtility property;
	JavaUltility javautility;
	DatabaseUtility dbUtility;

	@BeforeClass(alwaysRun=true)
	public void launchingBrowsernavigateToApplication() {
		property = new PropertyUtility();


		if(BROWSER.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");

			driver=new ChromeDriver(options);
		}
		else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(property.readingDataFromPropertyFile("url"));
		webDriverUtility=new WebDriverUtility(driver);
		dbUtility=new DatabaseUtility();
		javautility=new JavaUltility();
	}
	@BeforeMethod(alwaysRun=true)
	public void loginToApplication() {
		loginpage=new LoginPage(driver);
		registerpage=new RegisterPage(driver);
		welcomepage=new WelcomePage(driver);
		bookspage=new BooksPage(driver);
		computerspage=new ComputersPage(driver);
		jewelrypage=new JewelryPage(driver);
		
		screenshot=new TakeScreenShotUtility(driver);
		System.out.println("logged in to application");

	}
	@AfterMethod(alwaysRun=true)
	public void logoutFromApplication() {
		System.out.println("logged out from application");
	}
	@AfterClass(alwaysRun=true)
	public void closingTheServer() {
		driver.quit();
	}




}
//public class Base class{
//public static webDriver driver;
//public static TakesScreenShotUtility uti;
//@BeforeMethod
//public static void demo(){
//WebDriverManager.chromedriver().setup();
//ChromeOptions options=new ChromeOptions();
//options.addArguments("--remote-allow-origins=*");
//driver=new ChromeDriver(options);
//driver.manage().window().maximize();
//uti=new TakesScreenShotUtility(driver);
//}





