package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericUtility.BaseClasstwo;

public class LoginPage extends BaseClasstwo{
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id = "Email")
	private WebElement emailTextBox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "RememberMe")
	private WebElement rememberMeTextBox;
	
	@FindBy(id = "Forgot password?")
	private WebElement ForgotpasswordLink;
	
	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement loginbutton;
	
	//GETTER METHOD START
	
	
	public WebElement emailTextBox() {
		return emailTextBox;	
	}
	public WebElement passwordTextBox() {
		return passwordTextBox;
	}
	public WebElement rememberMeTextBox() {
		return rememberMeTextBox;
	}
	
	public WebElement ForgotpasswordLink() {
		return ForgotpasswordLink;
	}
	public WebElement loginbutton() {
		return loginbutton;
	}
	public WebElement getLoginLink() {
		// TODO Auto-generated method stub
		return null;
	}	
	
	

}
