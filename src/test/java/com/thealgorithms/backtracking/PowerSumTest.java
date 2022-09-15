package com.thealgorithms.backtracking;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class PowerSumTest {

	private void assertTrue(boolean PowerSum) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void powSumTest() 
	{
		PowerSum power = new PowerSum();
		assertTrue(power.powSum(1,1) == 1);
	}
	
	@Test
	void sumTest() 
	{
		PowerSum power = new PowerSum();
		power.Sum(1,1,1);
		assertTrue(power.getCount() == 1);
	}

}