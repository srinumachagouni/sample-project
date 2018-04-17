package com.srinu;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 6, result = 1;
		while(n!=0){
			result = result * n;
			n--;
		}
		System.out.println(result);

	}

}
