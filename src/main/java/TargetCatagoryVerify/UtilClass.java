package TargetCatagoryVerify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class UtilClass {

	WebDriver driver;

	@Test
	public void f() {
		//drive url=driver.get("https://www.target.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a[@id='js-toggleLeftNavLg']")).click();
	}
}
