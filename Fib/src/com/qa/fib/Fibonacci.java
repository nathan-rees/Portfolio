package com.qa.fib;

public class Fibonacci {
	public static void main(String[] args) {
		
	}
	public int fibonacci(int num)
	{
		if(num<2) {
			return num;
		}
		return fibonacci(num-1)+fibonacci(num-2);
	}

}
