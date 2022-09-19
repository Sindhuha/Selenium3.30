package loginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.Pom1;
import Pom.Pomf;

public class Fblog 
	{
		@Test
		public void Fblogin() throws InterruptedException
	 {
		System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Pomf p1=new Pomf(driver);
		p1.unTbox("sindhuha1995@gmail.com");
		Thread.sleep(2000);
		p1.pwdTbox("9845289221");
		Thread.sleep(2000);
		p1.clickLogin();
			}
	}




