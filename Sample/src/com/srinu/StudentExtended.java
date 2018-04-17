package com.srinu;

public class StudentExtended extends StudentClone{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public StudentExtended(int id, String name) {
		super(id, name);
		
	}

}
