package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel1 {
	public WebDriver driver;
	@Parameters ({"browser"})
	@Test
	public void excel(String browser)
	{
		System.setProperty("webdriver.gecko.driver", "./soft/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
	
	}

}
