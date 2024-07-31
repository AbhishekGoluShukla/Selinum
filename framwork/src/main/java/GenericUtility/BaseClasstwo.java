package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClasstwo {
	public WebDriver driver;
	public BaseClasstwo(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	@BeforeSuite
	public void  beforSuit() {
		Reporter.log("Befor Suit",true);
		
	}
	@BeforeTest
	public void  beforTest() {
		Reporter.log("Befor Test",true);
		
	}
	@Parameters("XYZ")
	@BeforeClass
	public void  LaunchingBrowser(String browserName) {
		Reporter.log("Befor Class",true);
		if(browserName.equalsIgnoreCase("Chrom")) {
			driver=new ChromeDriver();
		}
		else  if(browserName.equalsIgnoreCase("fire fox")) {
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@BeforeMethod
	public void  beforMethod() {
		Reporter.log("Befor Method",true);
		
	}
	@AfterMethod
	public void  afterMehod() {
		Reporter.log("After Method",true);
		
	}
	@AfterClass
	public void  CloseTheBrowser() {
		Reporter.log("After Class",true);
		driver.close();
		driver.quit();
		
	}
	@AfterTest
	public void  afterTest() {
		Reporter.log("After Test",true);
		
	}
	@AfterSuite
	public void  afterSuite() {
		Reporter.log("After Suit",true);
		
	}
	

}
