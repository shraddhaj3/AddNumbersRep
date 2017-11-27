package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.opt.Operation;

public class IntBoundaryVal {

	@Test
	public void Overflow() {
		Assert.assertEquals(0, Operation.add(Integer.MAX_VALUE, 10));
	}
	
	@Test
	public void underFlow() {
		Assert.assertEquals(0, Operation.add(Integer.MIN_VALUE, -2));
	}

}
