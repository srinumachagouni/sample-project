package com.srinu;

public class Fibonacci {

	public static void main(String[] args){
		int n = 6;
		int n1 = 0, n2 = 1, n3 =0;
		System.out.print(n1 + " " + n2);
		for(int i = 2; i < n; i++){
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
		}
	}
}
