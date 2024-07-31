package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ActionUtiles {
	Actions actions;

	public ActionUtiles(WebDriver driver) {
		actions = new Actions(driver);
	}
	
	public void clickOnElement(WebElement ele) {
		actions.click(ele).perform();
	}
	
	public void passDataForElement(WebElement ele, CharSequence... data) {
		actions.sendKeys(ele, data).perform();
	}
	
	public void mouseHoverOnElement(WebElement ele) {
		actions.moveToElement(ele).perform();
	}
	
	public void doubleClickOnElement(WebElement ele) {
		actions.doubleClick(ele).perform();
	}
	
	public void rightClickOnElement(WebElement ele) {
		actions.contextClick(ele).perform();
	}
	
	public void dragAndDropElement(WebElement src, WebElement dest) {
		actions.dragAndDrop(src, dest).perform();
	}
	
	public void dragAndDropElementByOffSet(WebElement ele, int XOffset, int YOffset) {
		actions.dragAndDropBy(ele, XOffset, YOffset).perform();
	}
	
	public void scrollBasedOnAxis(int XoffSet, int YOffSet) {
		actions.scrollByAmount(XoffSet, YOffSet).perform();
	}
	
	public void scrollUntilElementIsVisible(WebElement ele) {
		actions.scrollToElement(ele).perform();
	}
	
	public void scrollUntilElementVisible(WebElement ele, int XoffSet, int YoffSet) {
		ScrollOrigin origin = ScrollOrigin.fromElement(ele);
		actions.scrollFromOrigin(origin, XoffSet, YoffSet).perform();
	}
}