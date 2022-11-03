package org.grouping;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestng {
	
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before class1");
	}
	
	@AfterClass
	private void afterClass() {
		System.out.println("After class1");
	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before method1");
	}
	
	@AfterMethod
	private void afterMEthod() {
		System.out.println("After method1");
	}
	
	@Test(enabled=false)
	private void test() {
		System.out.println("Test method1------------");
	}
	
	@Test(priority=-3)
	private void test2() {
		System.out.println("Test method2------------");
	}
	
	@Test(invocationCount=0)
	private void test3() {
		System.out.println("Test method3------------");
	}
	
}
