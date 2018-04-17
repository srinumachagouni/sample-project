package com.srinu;

public class StudentClone implements Cloneable {

	private int id;
	private String name;

	public StudentClone(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
