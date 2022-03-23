package Registration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import Prerequisite.Setup;

public class Registration {

	@BeforeTest
	public void login() throws InterruptedException
	{
		
          Setup.driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7972697486");
          Setup.driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kallu0411");
          Setup.driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
      
	}
	
	@AfterTest
     public void Log_out() throws InterruptedException {
			Actions act = new Actions(Setup.driver);
			WebElement el = Setup.driver.findElement(
					By.xpath("(//*[name()='svg' and @class='zZ3yfL'])[1]//*[local-name()='path' and @class='_2gTTdy']"));
			act.moveToElement(el).perform();
			Thread.sleep(2000);
			Setup.driver.findElement(By.xpath(
					"//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[10]/a/div"))
					.click();

		 }

		
	}
	
	

