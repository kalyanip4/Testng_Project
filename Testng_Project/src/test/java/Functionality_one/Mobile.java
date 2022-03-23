package Functionality_one;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Prerequisite.Setup;

public class Mobile {

	@Test
	public void browsing_categories() throws InterruptedException
	{
		Thread.sleep(3000);
		Setup.driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]")).click();
		List<WebElement>list1=Setup.driver.findElements(By.tagName("a"));
		System.out.println(list1.size());
		Thread.sleep(3000);
		Setup.driver.findElement(By.xpath("(//div[@class='_24_Dny'])[2]")).click();
		Thread.sleep(3000);
		Setup.driver.findElement(By.xpath("(//div[@class='_24_Dny'])[15]")).click();
	}
	
	@Test
	public void add_to_compare() throws InterruptedException
	{
		Setup.driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[1]/div[2]/div/span/label/div")).click();
		Thread.sleep(3000);
	}
	
	
	@Test(dependsOnMethods ="add_to_compare")
	public void double_to_compare() throws InterruptedException
	{
		Setup.driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[1]/div[2]/div/span/label/div")).click();
		
	}
	
	
	
}
