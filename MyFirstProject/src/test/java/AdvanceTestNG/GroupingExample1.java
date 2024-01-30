package AdvanceTestNG;

import org.testng.annotations.Test;

public class GroupingExample1 {
	@Test(groups = "smoke")
	public void testcase1() {
		System.out.println("test1 of smoke testing");
	}

	@Test(groups = "regression")
	public void testcase2() {
		System.out.println("test2 of regression testing");

	}

	@Test(groups = "smoke")
	public void testcase3() {
		System.out.println("test3 of smoke testing");
	}

	@Test(groups = "smoke")
	public void testcase4() {
		System.out.println("test4 of smoke testing");
	}
}
