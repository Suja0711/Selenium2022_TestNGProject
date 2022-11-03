package org.sample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class A {
	@Parameters({"usrname", "password"})
	@Test
	public void test1(@Optional("kanish")String user,@Optional("66667777")String pass) {
		System.out.println("Username --- "+user);
		System.out.println("Password --- "+pass);
		System.out.println("Test A1");
	}
	
	@Test(enabled=false)
	public void test2() {
		System.out.println("Test A2");
	}
	
	@Test(enabled=false)
	public void test3() {
		System.out.println("Test A3");
	}
}
