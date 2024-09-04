package com.webDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class testNG2 {
	WebDriver driver;
	@BeforeClass
	public void openVerizon() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verizon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
public void executeVerizon() {
	driver.navigate().to("https://www.verizon.com/");
	String ver1 = driver.getTitle();
	System.out.println("The title of the website is" +ver1);
	Assert.assertEquals(ver1,"hdfc.com");
}
	@AfterClass
	public void closeVerizon() {
		System.out.println("Afterclass is closed");
		driver.quit();
	}
	

}
