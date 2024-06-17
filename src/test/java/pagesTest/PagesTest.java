package pagesTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.Pages;

public class PagesTest extends Base{
	Pages p;
	@BeforeMethod
	public void setup() throws IOException
	{
		initialistaion();
		p=new Pages();
	}
	@Test
	public void ApplicationTest() throws InterruptedException, IOException
	{
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=p.Application();
		Assert.assertEquals(expURL, actURL);
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}
