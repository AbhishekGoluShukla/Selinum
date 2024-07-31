package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import elementRepository.BasePage;
import elementRepository.LoginPage;

public class aaaa implements IAutoConstants, ITestListener{

	public WebDriver driver;
	public FileLibrary flib;
	public BasePage bp;
	public LoginPage lp;
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite", true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test", true);
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite", true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After Test", true);
	}
	@Parameters("bname")
	@BeforeClass
	public void launchingBrowser(@Optional("chrome") String browserName) {
		
		Reporter.log("Before class", true);
		if(browserName.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browserName.equalsIgnoreCase("edge"))
			driver=new ChromeDriver();
		else if(browserName.equalsIgnoreCase("firefox"))
			driver=new ChromeDriver();
		bp = new BasePage(driver);
		lp = new LoginPage(driver);
		flib =new FileLibrary();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitTimeOut));
	}
	@AfterClass
	public void tearDownBrowser() {
		Reporter.log("After class", true);
		driver.close();
		driver.quit();
	}
	@BeforeMethod
	public void navigateAndLoginToDWS() {
		Reporter.log("Before method", true);
		driver.get(flib.fetchDataFromProperties(propertyFilePath, "url"));
		lp.getLoginLink().click();
		lp.emailTextBox().sendKeys(flib.fetchDataFromProperties(propertyFilePath, "email"));
		lp.passwordTextBox().sendKeys(flib.fetchDataFromProperties(propertyFilePath, "password"));
		lp.loginbutton().click();
		
	}
	@AfterMethod
	public void afterMethod() {
		Reporter.log("After method", true);
		lp.getLoginLink().click();
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
	}
	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshotpath+"screenshot.png");
		try {
			FileHandler.copy(src, dest);
		} catch (Exception e) {
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
}