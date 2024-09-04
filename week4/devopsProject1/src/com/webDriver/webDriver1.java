package com.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verizon\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.verizon.com/");
		String title1 = driver.getTitle();
		System.out.println("The given title of webpage" +title1);
		String getsource = driver.getPageSource();
		System.out.println("The page source:" +getsource);
		
	}

}
