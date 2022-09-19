package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	//declaration
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginBtn;
	
	//initialization
	public Pom1(WebDriver driver)
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
