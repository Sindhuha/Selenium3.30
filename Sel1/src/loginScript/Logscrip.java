package loginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.Pom1;

public class Logscrip
{
	@Test
	public void Validlogin() throws InterruptedException
 {
	System.setProperty("webdriver.chrome.driver","./soft/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost/login.do;jsessionid=1ilpfs3p30u3r");
	Thread.sleep(2000);
	Pom1 p1=new Pom1(driver);
	p1.unTbox("admin");
	Thread.sleep(2000);
	p1.pwdTbox("manager");
	Thread.sleep(2000);
	p1.clickLogin();
		}
}
