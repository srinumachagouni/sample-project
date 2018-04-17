package com.srinu;

import java.util.HashMap;
import java.util.Map;


public enum EnumExample {
	
	ISSUANCE("001","wow");
	
	private EnumExample(String one, String two){
		this.one = one;
		this.two= two;
	}
	private String one;
	private String two;
	private static Map<String,EnumExample> AMTKEYMAP = 
			new HashMap<String,EnumExample>();
	static {
		for(EnumExample ex:EnumExample.values()){
			AMTKEYMAP.put(ex.one, ex);
		}
	}
	public static EnumExample findEnumEx(String one){
		return AMTKEYMAP.get(one);
	}
	public String getOne() {
		return one;
	}
	public void setOne(String one) {
		this.one = one;
	}
	public String getTwo() {
		return two;
	}
	public void setTwo(String two) {
		this.two = two;
	}
	
}
