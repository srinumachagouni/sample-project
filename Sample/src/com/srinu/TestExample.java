/**
 * 
 */
package com.srinu;

/**
 * 
 * @author srinu.machagouni
 * @release
 * @since 04-11-2018
 */
public class TestExample{
	
	
	
	

	public void runMethod(int n) {

		synchronized (this) {
			for(int i =1; i < 10; i++){
				System.out.println(n*i);
				 try{  
				       Thread.sleep(400);  
				      }catch(Exception e){System.out.println(e);}
			}
			
		}
	}

	

}
