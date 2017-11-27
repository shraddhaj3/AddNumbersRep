package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.opt.Operation;

public class PositiveNumbers {

	@Test
	public void positive() {
		Assert.assertEquals(50, Operation.add(20, 30));
	}
	
	@Test
	public void positiveNeg() {
		Assert.assertEquals(-10, Operation.add(20, -30));
	}
	
	@Test
	public void negPositive() {
		Assert.assertEquals(10, Operation.add(-20, 30));
	}
	
	@Test
	public void negativeNeg() {
		Assert.assertEquals(-50, Operation.add(-20, -30));
	}

}
