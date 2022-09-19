package sin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Scri extends GenScr{
	@Test
	public void Validlogin()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}
	}
