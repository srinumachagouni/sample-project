package com.srinu;

import java.util.Scanner;

public class LeftRotation {

	
	static int[] leftRotation(int[] a, int d) {
		int[] result = new int[a.length];
		for(int  j = 0; j < a.length;  j++){
			result[j] = a[(j+d)%a.length];
		}
		
		return result;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     //   int n = in.nextInt();
        int d = 2;
        int[] a = {1,2,3,4,5};
       
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
