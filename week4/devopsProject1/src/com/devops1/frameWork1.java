package com.devops1;

import java.util.Scanner;

import org.junit.Test;



public class frameWork1 {

	
	
@Test
public void checkChrome() {
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter the browser name");
	String input = sc1.next();
	if(input.contains("Chrome"))
		System.out.println("Chrome is installed");
	}
@Test
public void checkFireFox() {
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Enter the browser name");
	String input = sc2.next();
	if(input.contains("FireFox"))
		System.out.println("FireFox is installed");
	}
@Test
public void checkEdge() {
	Scanner sc3 = new Scanner(System.in);
	System.out.println("Enter the browser name");
	String input = sc3.next();
	if(input.contains("Edge"))
		System.out.println("Edge is installed");
	}
   

}



