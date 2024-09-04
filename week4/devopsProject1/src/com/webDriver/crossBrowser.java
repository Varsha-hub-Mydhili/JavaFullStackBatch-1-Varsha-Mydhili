package com.webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class crossBrowser {
	WebDriver driver;

	@Test

	 public void CreateChrome()

	 {

	 System.setProperty("webdriver.chrome.driver","C:\\Users\\verizon\\Downloads\\chromedriver_win32\\chromedriver.exe");

	 driver = new ChromeDriver();

	 driver.get("https://www.amazon.in/");

	 driver.manage().window().maximize();

	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	 String title = driver.getTitle();

	 System.out.println("The title entered:"+title);

	 }

	@Test

	public void CreateFireFox()

	{

	System.setProperty("webdriver.gecko.driver",

	     "C:\\Users\\verizon\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe");

	 WebDriver driver = new FirefoxDriver();

	 driver.get("https://www.facebook.com");

	 System.out.println(driver.getTitle());

	}


}
