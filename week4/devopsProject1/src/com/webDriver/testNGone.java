package com.webDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class testNGone {
   WebDriver driver;
   
@BeforeClass   
public void openVerizon() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\verizon\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
}
@Test
 public void executeBrowser() {
	 driver.get("https://www.flipkart.com/");
	 String title = driver.getTitle();
	 System.out.println("The given title of the website" +title);
	 Assert.assertEquals(title,"Google India");
	
}
@AfterClass
public void closeBrowser() {
	System.out.println("Exit the application");
	driver.quit();
}

}
