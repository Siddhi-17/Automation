package AdvanceTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retry {

	@Test(retryAnalyzer = AdvanceTestNG.retryfailedtc.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
	static int i=10;
	@Test(retryAnalyzer = AdvanceTestNG.retryfailedtc.class)
	public void Test3()
	{
		i++;
		Assert.assertEquals(i, 12);
	}
}