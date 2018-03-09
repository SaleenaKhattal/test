package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class swordactiverisk {
	static WebDriver driver=null;
	@BeforeClass
    public void LaunchWebSite()
   {
		System.setProperty("webdriver.chrome.driver","exeFiles/chromedriver.exe");
	     driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get(" http://www.sword-activerisk.com/");
		
    }


	@Test(priority=1) 
	public static void riskmanagement() throws InterruptedException
	{
		WebElement TFElement= driver.findElement(By.xpath("//input[@value='Search']"));
		TFElement.sendKeys("Risk Management");
		driver.findElement(By.id("searchsubmit")).click();
	    Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Risk Management Search Results");
	}
	
	
	
		
	
	@Test(priority=2)  
	public static void leverage() throws InterruptedException
	{

		WebElement TFElement= driver.findElement(By.xpath("//input[@value='Search']"));
	    Thread.sleep(3000);
		TFElement.sendKeys("Leverage");
		Thread.sleep(3000);
		driver.findElement(By.id("searchsubmit")).click();
		Thread.sleep(3000);	
		Assert.assertEquals(driver.getTitle(), "Leverage Search Results");
	}
	

	@Test(priority=3)  
	public static void compatability() throws InterruptedException
	{

		WebElement TFElement= driver.findElement(By.xpath("//input[@value='Search']"));
		TFElement.sendKeys("Compatability");
		Thread.sleep(3000);
		driver.findElement(By.id("searchsubmit")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Compatability Search Results"); 
	}
	
	@AfterClass
	public static void closebrowser()
	{
		driver.close();
	}
}
	