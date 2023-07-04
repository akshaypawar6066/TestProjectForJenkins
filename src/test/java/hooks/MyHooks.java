package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	
	@Before
	public void beforeHook()
	{
		System.out.println("Before hook");
	}
	
	
	@After
	public void afterHook()
	{
		System.out.println("After hook");
	}

}
