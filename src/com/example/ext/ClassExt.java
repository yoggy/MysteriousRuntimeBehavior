package com.example.ext;

import com.example.base.ClassBase;

public class ClassExt extends ClassBase {
	
	class InnerClassExt extends InnerClassBase {
		// warning : The method ClassExt.InnerClassExt.getRuntimeType() does not override the inherited method from ClassBase.InnerClassBase since it is private to a different package
		String getRuntimeType() {
			return "Dalvik";
		}
	}

	public ClassExt() {
		cls = new InnerClassExt();
	}
}
