package com.srinu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;


public class Solution{
//    public static void main(String args[]){
//        for(int i = 1; i <= 100; i++){
//             System.out.println(printFizzBuzz(i));  
//        }
//    }
//    private static String printFizzBuzz(int x){
//        if(x % 15 == 0)
//            return "FizzBuzz";
//        else if(x % 3 == 0)
//            return "Fizz";
//        else if(x % 5 == 0)
//            return "Buzz";
//        else 
//            return String.valueOf(x);
//    }
//	public static void main(String args[]){
//        int givenNumber = 6;
//        System.out.println(printFactorial(givenNumber));
//    }
//    private static int printFactorial(int x){
//        int result = 1;
//        while(x != 0){
//            result *= x;
//            x--;
//        }
//        return result;
//    }
	
	public static void main(String args[]) {
		final TestExample obj = new TestExample();//only one object  
		  
		Thread t1=new Thread(){  
		public void run(){  
		obj.runMethod(5);  
		}  
		};  
		Thread t2=new Thread(){  
		public void run(){  
		obj.runMethod(7);  
		}  
		};  
		  
		t1.start();  
		t2.start();  

		
	}
	 
	public static void execute() {

		Connection connection = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@ohie2_db1:1521:INTOHI01", "ABMSUSER",
					"aBmsusrQs2");
			PreparedStatement statement = connection
					.prepareStatement("Insert into OH_SOC_BUDG_LINE_ITEM (BUDGET_ID,CLASS_CODE,TYPE_CODE,COUNTBL_AMT,CREATED_BY,CREATED_ON,UPDATED_BY,UPDATED_ON) values (2112229,'UI','SAL',600,'2005',to_timestamp('14-MAR-18 12.52.40.771231000 PM','DD-MON-RR HH.MI.SSXFF AM'),'2005',to_timestamp('14-MAR-18 12.52.40.771282000 PM','DD-MON-RR HH.MI.SSXFF AM'))");

			// for insert/update
			statement.executeUpdate();
			// for select
			// ResultSet rs = statement.executeQuery();
			// if (rs.next()) {
			// System.out.println(rs.getInt(1));
			// }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	 public static char solution(String S) {
		        int[] occurrences = new int[26];
		        
		        for (char ch : S.toCharArray()) {
		            occurrences[ch - 'a']++;
		        }

		        char best_char = 'a';
		        int  best_res  = 0;

		        for (int i = 0; i < 26; i++) {
		            if (occurrences[i] > best_res) {
		                best_char = (char)((int)'a' + i);
		                best_res  = occurrences[i];
		                
		            }
		        }

		        return best_char;
		    
	    }
	    private static String isPalindrome(String str){
	    	
	        for(int i = 0; i < str.length(); i++){
	            if(str.charAt(i) != str.charAt(str.length()-i -1)){
	                return "is not palindrome";
	            }
	        }
	        return "is palindrome";
	    }
}