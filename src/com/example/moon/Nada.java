package com.example.moon;

public class Nada {

	public void doNada()
	{
		System.out.println("well, you got it. Git it?");
	}

	public int getCrap()
	{
		return 12;
	}

	public int timesTwo(int in)
	{
		return in*2;
	}


	public int timesThree(int in)
	{
		return in*3;
	}

	public int timesFour(int in)
	{
		// Uh oh..... *3   ????
		// We use this to trigger an assert
		return in*3;
	}
}
