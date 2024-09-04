package com.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fireFox1 {
    
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\verizon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[2]/a")).click();
		 driver.findElement(By.linkText("Sign Up")).click();
	 	
		 driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();

		 Thread.sleep(1000);

		 

		 // how to enter the date month and year in drop down box

		 WebElement day1=driver.findElement(By.id("day"));

		 day1.sendKeys("23");

		 Thread.sleep(2000);

		 WebElement mon1=driver.findElement(By.id("month"));

		 mon1.sendKeys("10");

		 Thread.sleep(2000);

		 WebElement year1=driver.findElement(By.id("year"));

		 year1.sendKeys("2002");

		 Thread.sleep(2000);

		 

//		 boolean v1=var2.isDisplayed();

//		 System.out.println(v1);

		/* List<WebElement> f1 =driver.findElements(By.xpath("//input[@type='radio']"));

		 System.out.println("Number of radio buttons"+f1.size());

		 for(WebElement var1:f1)

		 {

			 System.out.println(var1.getAttribute("value"));

		 }

		 */

		 }
		
		

	}

