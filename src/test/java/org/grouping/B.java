package org.grouping;

import org.testng.annotations.Test;

public class B {
	
	@Test(groups="smoke")
	public void test1() {
		System.out.println("Test B1");
	}
	
	@Test(groups="smoke")
	public void test2() {
		System.out.println("Test B2");
	}
	
	@Test(groups="smoke")
	public void test3() {
		System.out.println("Test B3");
	}
	@Test(groups="sanity")
	public void test4() {
		System.out.println("Test B4");
	}
	@Test(groups="sanity")
	public void test5() {
		System.out.println("Test B5");
	}
	@Test(groups="sanity")
	public void test6() {
		System.out.println("Test B6");
	}
	@Test(groups="regression")
	public void test7() {
		System.out.println("Test B7");
	}
	@Test(groups="regression")
	public void test8() {
		System.out.println("Test B8");
	}
	@Test(groups="retest", priority=-2)
	public void test9() {
		System.out.println("Test B9");
	}
	@Test(groups="retest", priority=-1)
	public void test10() {
		System.out.println("Test B10");
	}
}
