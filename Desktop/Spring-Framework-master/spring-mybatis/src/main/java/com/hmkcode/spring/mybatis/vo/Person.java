package com.hmkcode.spring.mybatis.vo;

/**
 * Hello world!
 * 
 */
public class Person {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "id: " + id + " - name: " + name;
	}
}
