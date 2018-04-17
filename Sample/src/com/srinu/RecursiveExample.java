/**
 * 
 */
package com.srinu;

/**
 * @author srinu.machagouni
 *
 */
public class RecursiveExample {
	static int n1 = 0;
	static int n2 = 1;
	static int result = 0;
	public static void main(String args[]) {
		
		//recursivelyRun(6);
		recursivelyFibRun(6);
	}

	private static void recursivelyRun(int  n) {
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1 + " " + n2);
		for(int i = 0; i < n; i++){
			int result  = n1 + n2;
			System.out.println(result);
			n1 = n2;
			n2 = result;
		}
	}
	
	private static int recursivelyFactRun(int n){
	if(n != 0)
		return n * recursivelyFactRun(n-1);
	else 
		return 1;
	}

	private static void recursivelyFibRun(int n){
		
		if(n > 0){
			result  = n1 + n2;
			System.out.println(result);
			n1 = n2;
			n2 = result;
		recursivelyFibRun(--n);
		}
		
}

}