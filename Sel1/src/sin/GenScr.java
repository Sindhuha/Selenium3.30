package sin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenScr {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
    driver=new ChromeDriver();
   driver.get("http://localhost/login.do;jsessionid=1ilpfs3p30u3r");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeAppln() throws InterruptedException
	{
	Thread.sleep(4000);	
	driver.close();
	}


}
