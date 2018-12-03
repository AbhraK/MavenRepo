package com.codebind;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.*;

public class TestClass {
	
	@Test
	public void test1()
	{
		System.out.println("Hello, How are you?");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2()
	{
	
		Assert.assertTrue(false);
		System.out.println("Hi, I'm fine..");
		Logger logger=LoggerFactory.getLogger(App.class);
		logger.info("Hello World");
	}
}
