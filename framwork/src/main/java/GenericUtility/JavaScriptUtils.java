package GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtils {
	WebDriver driver;
	JavascriptExecutor js;
	public  JavaScriptUtils(WebDriver driver) {
		this.driver = driver;
		this.js=(JavascriptExecutor)driver;
	}
	 
}
