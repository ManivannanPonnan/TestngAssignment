package org.manitestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngfirstclass {
	@Test(groups="ADD")
	@Parameters({ "x", "y" })
	public void add(int x, int y) {
		int sum;
		sum = x + y;
		System.out.println(":Result" + sum);
		Reporter.log("TestNG_ReportsAndLogs -> Add", true);
		Assert.assertNotEquals(sum, 74);
	}

	@Test(groups="SUB")
	@Parameters({ "x", "y" })
	public void sub(int x, int y) {
		int sub;
		sub = x - y;
		Assert.assertEquals(sub, -20);
		System.out.println(sub);
		Reporter.log("TestNG_ReportsAndLogs -> Sub", true);
	}

	@Test(groups="MUL")
	@Parameters({ "x", "y" })
	public void multiplication(int x, int y) {
		int mult;
		mult = x * y;
		System.out.println(mult);
			Assert.assertEquals(mult,800 );
			Reporter.log("TestNG_ReportsAndLogs -> Multiplication", true);
		} 
		

	

	@Test(groups="DIV")
	@Parameters({ "x", "y" })
	public void division(int x, int y) {
			int div;
			div = x / y;
			System.out.println(div);
			Reporter.log("TestNG_ReportsAndLogs -> Division", true);
					} 
	
}