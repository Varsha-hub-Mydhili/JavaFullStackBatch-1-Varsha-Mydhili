package com.webDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonDemo {

	static WebDriver driver=null;
	public static void main(String[] args) {
		try {

			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\verizon\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.get("https://www.amazon.com/");

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			String title = driver.getTitle();

			System.out.println("The title entered:"+title);

			WebElement dr1=driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));

			Actions act = new Actions(driver);

			act.moveToElement(dr1).perform();

			Thread.sleep(1000);

			driver.findElement(By.xpath("//span[contains(text(),'Create a Wish List')]")).click();

			Thread.sleep(1000);

			}catch(Exception e)

			{

				e.printStackTrace();

			}

			finally

			{

				driver.close();

			}


	}







		
	}


