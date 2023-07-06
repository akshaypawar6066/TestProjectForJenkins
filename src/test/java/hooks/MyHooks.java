package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooks {
	
	
	@Before("@regression")
	public void beforeHook1()
	{
		System.out.println("Before hook1");
	}	
	
	
//	@Before(order = 2)
//	public void beforeHook2()
//	{
//		System.out.println("Before hook2");
//	}	
	
	@After("@functional")
	public void afterHook1()
	{
		System.out.println("After hook1");
	}
	
//	@After(order = 2)
//	public void afterHook2()
//	{
//		System.out.println("After hook2");
//	}
	
	
	@BeforeStep
	public void beforeStep()
	{
	System.out.println("Before Step");
	}
	
	
	@AfterStep
	public void afterStep()
	{
	System.out.println("After Step");
	}

}
