package utilities;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws Exception {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resource");
		Properties prop = new Properties();
		prop.load(fis);
		
		String browserType = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		if(browserType.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	} 
}
