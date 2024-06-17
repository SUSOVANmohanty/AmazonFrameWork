package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;
import utility.ReadData;

public class Pages extends Base{
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement user;
	@FindBy(xpath="//input[@id='password']") private WebElement pass;
	@FindBy(xpath="//input[@id='login-button']") private WebElement lgin;
	
	public Pages()
	{
		PageFactory.initElements(driver, this);
	}
	public String Application() throws InterruptedException, IOException 
	{
		user.sendKeys(ReadData.readPropertyFile("user"));
		Thread.sleep(2000);
		pass.sendKeys(ReadData.readPropertyFile("pass"));
		Thread.sleep(2000);
		lgin.click();
		return driver.getCurrentUrl();	
	}
}
