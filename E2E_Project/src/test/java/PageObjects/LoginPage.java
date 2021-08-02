package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='email']")
	WebElement email;
	@FindBy(id = "user_password")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;

   public WebElement email() {
     return email;	
    }
   public WebElement passord() {
  
   return password;
   
   }
   public WebElement submitbutton() {
	   
	   return submitButton;
	   
	   }




}