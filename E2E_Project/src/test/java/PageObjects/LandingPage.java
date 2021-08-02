				package PageObjects;
				
				import org.openqa.selenium.By;
				import org.openqa.selenium.WebDriver;
				import org.openqa.selenium.WebElement;
				import org.openqa.selenium.support.FindBy;
				import org.openqa.selenium.support.PageFactory;
				
				public class LandingPage {
				
					WebDriver driver;
					public LandingPage(WebDriver driver){
						this.driver=driver;
						PageFactory.initElements(driver, this);
					}
					 By signin=By.xpath("div[contains(@a,'sign in']");
				    @FindBy(xpath="//body[1]/header[1]/div[2]/div[1]/nav[1]/ul[1]/li[8]/a[1]")
				    WebElement Contact_Us;
					public By NothanksButton= By.xpath("//body[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[6]/div[1]/div[1]/button[1]");
				
				    
					
					public void signin() {
						
						 driver.findElement(signin).click();;
					}
					public WebElement ContactUs() {
						return Contact_Us;
					
				}
					
					public WebElement noThanksButton() {
						
						return driver.findElement(NothanksButton);
						
						
					}
					
					
					}
