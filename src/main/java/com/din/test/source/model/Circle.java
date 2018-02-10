package com.din.test.source.model;

import com.din.test.source.DoNotLog;

public class Circle {
	private String name;
	@DoNotLog
	private String size;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String setNameReturn(String name) {
		this.name = name;
		return name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return this.name+this.size;
	}


}
