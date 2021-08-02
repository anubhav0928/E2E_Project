	package Academy;
	
	import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	
	import PageObjects.LandingPage;
	import PageObjects.LoginPage;
	import Resources2.base;
	
	public class HomePage extends base {

		WebDriver driver;
		@Test(dataProvider="getData")
		public void basePageNavigation(String username,String password,String usertype) throws IOException, InterruptedException {
			
			driver = initializeDriver();
			driver.get(UrlName);
			LandingPage log = new LandingPage(driver);
		
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			if(driver.findElement(log.NothanksButton).isDisplayed()) {
			log.noThanksButton().click();
			log.signin();
			}
			else { 
			log.signin();}
			
			
			
			LoginPage login=new LoginPage(driver);
			login.email().sendKeys(username);
			login.passord().sendKeys(password);
			System.out.println(usertype);
			login.submitbutton().click();
			driver.quit();
		}
	    @AfterMethod
		public void Teardown() {
			
			driver.quit();
		}
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[3][3];
			data[0][0]="anubhavsood0009@gmail.com";
			data[0][1]="123123";
			data[0][2]="Ganda banda";
		
			data[1][0]="anubhavsood0009@gmail.com";
			data[1][1]="123123";
			data[1][2]="Ganda banda";
			
			data[2][0]="anubhavsood0009@gmail.com";
			data[2][1]="123123";
			data[2][2]="Ganda banda";
		return data;
		}
	
	}
