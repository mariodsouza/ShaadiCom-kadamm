package test.MobileBanking.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import MobileBankingBaseTest.CommonApps;
import MobileBankingBaseTest.Driver;
import MobileBankingBaseTest.MobileBankingBaseClass;


public class Registration{
	
	/**
	 * @param email 
	 * This method is used to enter the Email ID on registration screen.
	 */
	public void enterEmail(String email)
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("Emailtxt"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("Emailtxt"))).sendKeys(email);
	}
	
	/**
	 * @param password 
	 * This method is used to enter Password on registration screen.
	 */
	public void enterPassword(String password)
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("Passwordtxt"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("Passwordtxt"))).sendKeys(password);
	}
	
	/**
	 * @param profile 
	 * This method is used to select Profile on registration screen.
	 */
	public void selectProfile(String profile)
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("ProfileForlst"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("ProfileForlst"))).click();
		CommonApps.gestSwipeVerticalTillElementVisible(profile);
		CommonApps.selectElementFromList(profile);
	}
	
	/**
	 * @param firstname 
	 * This method is used to enter First Name on registration screen.
	 */
	public void enterFirstName(String firstname)
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("FirstNametxt"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("FirstNametxt"))).sendKeys(firstname);
	}
	
	/**
	 * @param lastname 
	 * This method is used to enter Last Name on registration screen.
	 */
	public void enterLastName(String lastname)
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("LastNametxt"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("LastNametxt"))).sendKeys(lastname);
	}
	
	/**
	 * @param gender 
	 * This method is used to select Gender on registration screen.
	 */
	public void selectGender(String gender)
	{
		
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("Genderlst"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("Genderlst"))).click();
		CommonApps.gestSwipeVerticalTillElementVisible(gender);
		CommonApps.selectElementFromList(gender);
	}
	
	/**
	 * @param day 
	 * This method is used to select Day on registration screen.
	 */
	public void selectDay(String day)
	{	
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("Daylst"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("Daylst"))).click();
		CommonApps.gestSwipeVerticalTillElementVisible(day);
		CommonApps.selectElementFromList(day);
	}
	
	/**
	 * @param month 
	 * This method is used to select Month on registration screen.
	 */
	public void selectMonth(String month)
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("Monthlst"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("Monthlst"))).click();
		//Driver.getInstance().findElement(By.xpath("//*[@text='Month']")).click();
		CommonApps.gestSwipeVerticalTillElementVisible(month);
		CommonApps.selectElementFromList(month);
	}
	
	/**
	 * @param year 
	 * This method is used to select Year on registration screen.
	 */
	public void selectYear(String year)
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("Yearlst"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("Yearlst"))).click();
		CommonApps.gestSwipeVerticalTillElementVisible(year);
		CommonApps.selectElementFromList(year);
	}
	
	/**
	 * @param religion 
	 * This method is used to select Year on registration screen.
	 */
	public void selectReligion(String religion)
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("Religionlst"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("Religionlst"))).click();
		CommonApps.gestSwipeVerticalTillElementVisible(religion);
		CommonApps.selectElementFromList(religion);
	}
	
	/**
	 * @param mothertongue 
	 * This method is used to select Year on registration screen.
	 */
	public void selectMotherTongue(String mothertongue)
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("MotherTonguelst"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("MotherTonguelst"))).click();
		CommonApps.gestSwipeVerticalTillElementVisible(mothertongue);
		CommonApps.selectElementFromList(mothertongue);
	}
	
	/**
	 * @param country 
	 * This method is used to select Year on registration screen.
	 */
	public void selectCountry(String country)
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("LivingInlst"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("LivingInlst"))).click();
		CommonApps.gestSwipeVerticalTillElementVisible(country);
		CommonApps.selectElementFromList(country);
	}
	
	/**
	 * This method is used to click submit button on registration screen.
	 */
	public void clickOnSubmitbtn()
	{
		CommonApps.waitForElementToBeEnabled(MobileBankingBaseClass.getElementByID("Submitbtn"));
		Driver.getInstance().findElement(By.id(MobileBankingBaseClass.getElementByID("Submitbtn"))).click();
	}
	
	public boolean getErrorMessage()
	{
		try {
		Driver.getInstance().findElement(By.xpath("//*[@text='Date of birth is mandatory.']"));
		}catch(Exception e)
		{
		return false;
		}
		return true;
	}

}
