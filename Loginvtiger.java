package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginvtiger {
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
	}

}
