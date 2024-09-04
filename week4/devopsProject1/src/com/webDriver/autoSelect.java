package com.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSelect {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verizon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();

		 driver.navigate().to("https://www.flipkart.com/");

		 driver.manage().window().maximize();

// 		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");

		 Thread.sleep(3000);

		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ARROW_DOWN);

		 Thread.sleep(3000);

		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);

		 

	 

     

		 



	}





	}


