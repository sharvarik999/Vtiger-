package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Campining {
	
	@FindBy(id="Campaigns_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addcampingbt;

	public WebElement getAddcampingbt() {
		return addcampingbt;
	}

}
