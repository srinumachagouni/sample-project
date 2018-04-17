package com.srinu;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="madtam";
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != str.charAt(str.length()-1 - i)){
				System.out.println("is not palindrom");
			}
			else {
				System.out.println("is palindrom");
			}
		}
		int n = 323, reverse = 0;
		int palin  = n;
		while(palin!=0){
			int rem = palin % 10;
			reverse = reverse * 10 + rem ;
			palin = palin /10;
		}
		if(n == reverse){
			System.out.println("is palindrom");
		}
	}

}
