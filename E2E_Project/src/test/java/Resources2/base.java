package Resources2;
	
	
	import java.io.FileInputStream;
	
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
	
	public  class base {
		public  String UrlName;
		public WebDriver driver;
	
		public WebDriver initializeDriver() throws IOException {
	
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
					+"\\src\\main\\java\\Academy\\data.properties");
			prop.load(fis);
			String browserName =System.getProperty("browser");
			//String browserName = prop.getProperty("browser");
		     UrlName = prop.getProperty("url");
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C://seleniumweb2//chromedriver.exe");
				ChromeOptions options=new ChromeOptions();
				options.addArguments("headless");
				driver = new ChromeDriver(options);
	
				// URL in the browser
	
			} else if (browserName.equalsIgnoreCase("Firefox")) {
	          System.setProperty("webdriver.gecko.driver","C://seleniumweb2//geckodriver.exe");
				driver=new FirefoxDriver();
	          // IE
	
			} else if (browserName == "IE") {
	
			}
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       return driver;
		}
	
	}
