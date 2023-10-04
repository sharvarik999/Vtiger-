package Basic01;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.Campining;
import POM.CreatNewcampining;
import POM.DashbordVtiger;
import POM.Loginvtiger;

public class VtigerBase_Different {
	
	@Test
	public void Vtiger() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		FileInputStream fis=new FileInputStream("src\\test\\resources\\Vtiger.properties.txt");
		
		Properties p=new Properties();
		p.load(fis);
		
		String URL=p.getProperty("url");
		String NAME=p.getProperty("campaignName");
		String TARGET=p.getProperty("TargetAudiance");
		String EXPECTEDCLOSEDATE=p.getProperty("ExceptedcloseDate");
		String SPONSER=p.getProperty("Sponsor");
		String TARGETSIZE=p.getProperty("TargetSize");
		String NUMESENT=p.getProperty("NumSent ");
		String BUDGESIZE=p.getProperty("BudgetCost");
		String ACTUALCOST=p.getProperty("ActualCost");
		String EXCEPTEDREVENUE=p.getProperty("ExpectedRevenue");
		String EXCEPTEDSALESCOUNT=p.getProperty("ExpectedSalesCount");
		String ACTUALSALESCOUNT=p.getProperty("ActualSalesCount");
		String EXCEPTEDRESPONSEDCOUNT=p.getProperty("ExceptedResponsedCount");
		String ACTUALRESPONSEDCOUNT=p.getProperty("ActualResponseCount");
		String EXCEPTEDROI=p.getProperty("ExceptedROI");
		
		
		//Login page 
		driver.get(URL);
		Loginvtiger lv=new Loginvtiger();
		PageFactory.initElements(driver, lv);
		lv.getSigninbtn().click();
			
			//dashboard //cliking on menubar //cliking on markiting //cliking on campining
			DashbordVtiger dv=new DashbordVtiger();
			PageFactory.initElements(driver, dv);
			dv.getMenubar().click();
			WebElement marketing = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
			Actions a=new Actions(driver);
			a.moveToElement(marketing);
			a.perform();
			dv.getCampaigns().click();
			//a.moveToElement(dv.getMarketing()).perform();
			
			//Add to campining
			Campining cp=new Campining();
			PageFactory.initElements(driver, cp);
			cp.getAddcampingbt().click();
			
			//filling the campining form
			CreatNewcampining cn=new CreatNewcampining();
			PageFactory.initElements(driver, cn);
			cn.getCampingname().sendKeys(NAME);
			cn.getTarger().sendKeys(TARGET);
			cn.getDate().sendKeys(EXPECTEDCLOSEDATE);
			cn.getDate().sendKeys(Keys.ENTER);
			cn.getSponsor().sendKeys(SPONSER);
			cn.getTargetsize().sendKeys(TARGETSIZE);
			cn.getNumset().sendKeys(NUMESENT);
			cn.getBugetcost().sendKeys(BUDGESIZE);
			cn.getActualcost().sendKeys(ACTUALCOST);
			cn.getExceptedrevenue().sendKeys(EXCEPTEDREVENUE);
			cn.getExceptdsalescount().sendKeys(EXCEPTEDSALESCOUNT);
			cn.getActualsalescount().sendKeys(ACTUALSALESCOUNT);
			cn.getExpectedcount().sendKeys(EXCEPTEDRESPONSEDCOUNT);
			cn.getActualcount().sendKeys(ACTUALRESPONSEDCOUNT);
			cn.getExceptedroi().sendKeys(EXCEPTEDROI);
			
			
			
		
//		cn.getDate().sendKeys("2-dec-23");
//		cn.getDate().sendKeys(Keys.ENTER);
//			
			
		
		
	}

}
