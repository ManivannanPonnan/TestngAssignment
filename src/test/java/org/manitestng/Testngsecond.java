package org.manitestng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testngsecond {
	@DataProvider(name="root")
	  public Object[][] dataprovider() {
	    return new Object[][] {
	      new Object[] { 2, 4 },
	      new Object[] { 6, 8 },
	      new Object[] { 12, 14 }
	    };
	  }
	  
	 
	  @Test(dataProvider="root",groups="Root")
	  public void squareRoot(int a,int b) {
		 
		  System.out.println("Squareroot = "+ a*a);
		  System.out.println("Squareroot = "+ b*b);
		  Reporter.log("TestNG_ReportsAndLogs -> Root", true);

	  }
}
