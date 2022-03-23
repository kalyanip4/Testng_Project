package Prerequisite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {

	public static void launching_Browser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//div[@class='exehdJ']"));
		action.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		//ul[@class='pO9syL']//li
	}
}
