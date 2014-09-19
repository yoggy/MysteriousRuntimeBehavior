package com.example.base;

public class ClassBase  {
	protected class InnerClassBase {
		String getRuntimeType() {
			return "ART";
		}
	}
	
	protected InnerClassBase cls;
	
	public String getRuntimeType() {
		if (cls == null) return "null";
		return cls.getRuntimeType();
	}
}