package com.devops1;

import org.testng.annotations.Test;

public class carGears {
	
	@Test(priority=2)
	public void firstGear() {
		System.out.println("first gear");
	}
	@Test(priority=1)
	public void noGear() {
		System.out.println("no gear");
	}
	@Test(priority=3)
	public void secondGear() {
		System.out.println("second gear");
	}

}
