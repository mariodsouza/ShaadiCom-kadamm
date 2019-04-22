package test.MobileBanking.form;

import org.openqa.selenium.By;
import MobileBankingBaseTest.CommonApps;
import MobileBankingBaseTest.Driver;
import MobileBankingBaseTest.MobileBankingBaseClass;

public class FlashScreen extends MobileBankingBaseClass {
	
	public void clickUserRegistrationbtn() throws InterruptedException
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("registration_btnSignup"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("registration_btnSignup"))).click();
	}

}
