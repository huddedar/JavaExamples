package com.shekhar;

import java.util.stream.Stream;

public class MethodRef {
	public int var;
	
	public MethodRef(int var) {
		this.var = var;
	}
	
	public static void log(MethodRef var) {
		System.out.println("logging");
	}

	public static void main(String[] args) {
		Stream<MethodRef> data = Stream.of(new MethodRef(1), new MethodRef(2));
		data.forEach(MethodRef :: log);
	}

}
