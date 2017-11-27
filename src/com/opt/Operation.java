package com.opt;

public class Operation {
	public static int add(int a, int b) {
		long result = ((long)a + (long)b);
		
		//If addition result value overflows or underflows return 0
		if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
			return 1;
		
		return (int)result;
	}
}
