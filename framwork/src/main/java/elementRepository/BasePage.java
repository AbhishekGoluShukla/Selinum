package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement ShoppingLink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement WishlistLink;
	
	@FindBy(partialLinkText  = "BOOKS")
	private WebElement bookLink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement ComputersLink;
	
	@FindBy(partialLinkText  = "ELECTRONICS")
	private WebElement ElectronicsLink;
	
	@FindBy(partialLinkText  = "APPAREL & SHOSE")
	private WebElement ApparelAndShoesLink;
	
	@FindBy(partialLinkText  = "DIGITAL DAWNLOADS")
	private WebElement DigitaldownloadsLink;
	
	@FindBy(partialLinkText  = "JEWELRY")
	private WebElement JewelryLink;
	
	@FindBy(partialLinkText  = "GIFT CARDS")
	private WebElement GiftCardslINK;
	
	@FindBy (xpath = "//input[@class='button-1 search-box-button']")
	private WebElement SerchButton;
	
	@FindBy(id = "small-searchterms")
	private WebElement serchBox;
	
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement Logo;
	
	//GETTER METHOD START
	
	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getShoppingLink() {
		return ShoppingLink;
	}


	public WebElement getWishlistLink() {
		return WishlistLink;
	}


	public WebElement getBookLink() {
		return bookLink;
	}


	public WebElement getComputersLink() {
		return ComputersLink;
	}


	public WebElement getElectronicsLink() {
		return ElectronicsLink;
	}


	public WebElement getApparelAndShoesLink() {
		return ApparelAndShoesLink;
	}


	public WebElement getDigitaldownloadsLink() {
		return DigitaldownloadsLink;
	}


	public WebElement getJewelryLink() {
		return JewelryLink;
	}


	public WebElement getGiftCardslINK() {
		return GiftCardslINK;
	}


	public WebElement getSerchButton() {
		return SerchButton;
	}


	public WebElement getSerchBox() {
		return serchBox;
	}


	public WebElement getLogo() {
		return Logo;
	}


	public BasePage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}

}
