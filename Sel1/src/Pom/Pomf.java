package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomf
{
	//declaration
		@FindBy(id="email")
		private WebElement username;
		@FindBy(id="pass")
		private WebElement password;
		@FindBy(name="login")
		private WebElement LoginBtn;
		
		//initialization
		public Pomf(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public void unTbox(String un)
		{
			username.sendKeys(un);
		}
		public void pwdTbox(String pwd)
		{
			password.sendKeys(pwd);
		}
		public void clickLogin()
		{
			LoginBtn.click();
		}
	}

