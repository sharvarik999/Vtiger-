package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashbordVtiger {
@FindBy(xpath="(//div[@class='row app-navigator'])[1]")
private WebElement menubar;

@FindBy(xpath="//span[text()=' MARKETING']")
private WebElement markettf;

public WebElement getMenubar() {
	return menubar;
}

public WebElement getMarkettf() {
	return markettf;
}

public WebElement getCampaigns() {
	return campaigns;
}

@FindBy(xpath="//span[text()=' Campaigns']")
private WebElement campaigns;
	
	
}
