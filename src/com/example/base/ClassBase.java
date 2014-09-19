package com.example.base;

public class ClassBase  {
	String getRuntimeTypeImpl() {
		return "ART";
	}
	
	public String getRuntimeType() {
		return getRuntimeTypeImpl();
	}
}