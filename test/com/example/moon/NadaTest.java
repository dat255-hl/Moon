package com.example.moon;

import static org.junit.Assert.*;

import org.junit.Test;

public class NadaTest {

	@Test
	public void testGetCrap() {
		Nada n = new Nada();
	    assertEquals("getCrap", 12, n.getCrap());
		System.out.println("\ngetCrap: OK");
	}
	
	@Test
	public void testTwoTimes() {
        int i;
		Nada n = new Nada();
		for (i=0;i<2000;i++)
		{
			assertEquals("twoTimes", i*2, n.timesTwo(i));	
/*			System.out.print(".");
			if (i%10==0) { System.out.println();}
			*/
		}
		System.out.println("timesTwo: OK");
	}
	
	@Test
	public void testDoNada() {
		Nada n = new Nada();
		n.doNada();
//		fail("Not yet implemented");
		System.out.println("\ndoNada: OK");
	}
	
	
}