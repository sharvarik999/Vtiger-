package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatNewcampining {
	
	@FindBy(id="Campaigns_editView_fieldName_campaignname")
	private WebElement campingname;
	
	@FindBy(id="Campaigns_editView_fieldName_targetaudience")
	private WebElement targer;
	
//	@FindBy(id="Campaigns_editView_fieldName_closingdate")
//	private WebElement excepteddate;

	public WebElement getCampingname() {
		return campingname;
	}																																																																									

	public WebElement getTarger() {
		return targer;
	}

//	public WebElement getExcepteddate() {
//		return excepteddate;
	
	
	@FindBy(id="Campaigns_editView_fieldName_sponsor")
	private WebElement sponsor;

	public WebElement getSponsor() {
		return sponsor;
	}
	
	
	@FindBy(id="Campaigns_editView_fieldName_targetsize")
	private WebElement targetsize;

	public WebElement getTargetsize() {
		return targetsize;
	}

@FindBy(id="Campaigns_editView_fieldName_numsent")
private WebElement numset;

public WebElement getNumset() {
	return numset;
}
	@FindBy(id="Campaigns_editView_fieldName_budgetcost")
	private WebElement Bugetcost;
	
	@FindBy (id="Campaigns_editView_fieldName_actualcost")
	private WebElement actualcost;
	
	@FindBy(id="Campaigns_editView_fieldName_expectedrevenue")
	private WebElement exceptedrevenue;
	
	@FindBy(id="Campaigns_editView_fieldName_expectedsalescount")
	private WebElement exceptdsalescount;
	
	@FindBy(id="Campaigns_editView_fieldName_actualsalescount")
	private WebElement actualsalescount;
	
	@FindBy(id="Campaigns_editView_fieldName_expectedresponsecount")
	private WebElement expectedcount;
	
	@FindBy(id="Campaigns_editView_fieldName_actualresponsecount")
	private WebElement actualcount;
	
	@FindBy(id="Campaigns_editView_fieldName_expectedroi")
	private WebElement exceptedroi;
	
	@FindBy(id="Campaigns_editView_fieldName_actualroi")
	private WebElement actualroi;

	public WebElement getBugetcost() {
		return Bugetcost;
	}

	public WebElement getActualcost() {
		return actualcost;
	}

	public WebElement getExceptedrevenue() {
		return exceptedrevenue;
	}

	public WebElement getExceptdsalescount() {
		return exceptdsalescount;
	}

	public WebElement getActualsalescount() {
		return actualsalescount;
	}

	public WebElement getExpectedcount() {
		return expectedcount;
	}

	public WebElement getActualcount() {
		return actualcount;
	}

	public WebElement getExceptedroi() {
		return exceptedroi;
	}

	public WebElement getActualroi() {
		return actualroi;
		
		
		
	}
	
	@FindBy(id="Campaigns_editView_fieldName_description")
	private WebElement description;

	public WebElement getDescription() {
		return description;
	}
	
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement canclebtn;

	public WebElement getCanclebtn() {
		return canclebtn;
	}
	
//	@FindBy(xpath="//button[text()='Save']")
//	private WebElement savabtn;
//
//	public WebElement getSavabtn() {
//		return savabtn;
//	}
	
	@FindBy(id="Campaigns_editView_fieldName_closingdate")
	 private WebElement date;

	public WebElement getDate() {
		return date;
	}
	
	
}