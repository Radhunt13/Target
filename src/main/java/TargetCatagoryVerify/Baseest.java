package TargetCatagoryVerify;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Baseest {

	WebDriver driver;

	@Test
	public void f() {
		
		

		System.setProperty("webdriver.gecko.driver", "/Users/haquespc/Downloads/geckodriver");

		driver = new FirefoxDriver();

		driver.get("https://www.target.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a[@id='js-toggleLeftNavLg']")).click();
		ArrayList ar2=getActualValue(driver.findElements(By.xpath("//nav[@id='leftNavigation']/ul[2]/li")));
		String [] ar3= {"Christmas","gift ideas","clothing","shoes"};
		for(int i=0;i<=ar2.size();i++) {
			//Assert.assertEquals(ar2.get(i), ar3[i]);
			Assert.assertEquals(ar2.get(i),ar3[i] );
			System.out.println(ar2.get(i)+"match"+ar3[i]);
			
		}
		
	}
	public ArrayList getActualValue(List<WebElement> elements) {
		ArrayList ar= new ArrayList();
		for(WebElement element:elements) {
			ar.add(element.getText());	
		}
		System.out.println(ar);
		return ar;
	}
//	public
//	{
//
//	
//	
//	}
}

	
	
