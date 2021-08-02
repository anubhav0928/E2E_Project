package Academy;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import Resources2.base;


public class ContactusTest extends base {
	WebDriverWait w;
	LandingPage log;
	private static Logger loger=LogManager.getLogger(ContactusTest.class.getName());
@BeforeTest
  public void beforeTest() throws IOException {
	driver = initializeDriver();
	loger.info("initializing");

	driver.get(UrlName);
}
	@Test
	public void basePageNavigation() throws IOException {

		loger.info("initializing");
		log = new LandingPage(driver); 
		w = new WebDriverWait(driver, 50);
		loger.info("initializing");
		w.until(ExpectedConditions.visibilityOf(log.noThanksButton()));
		log.noThanksButton().click();
		log.ContactUs().isDisplayed();
		Assert.assertEquals(log.ContactUs().isDisplayed(), true);
	
	}
	
	@AfterTest
	public void Teardown() {
		
		driver.quit();
	}

}

